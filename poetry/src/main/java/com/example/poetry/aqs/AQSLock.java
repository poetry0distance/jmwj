package com.example.poetry.aqs;

import lombok.extern.slf4j.Slf4j;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.LockSupport;
import java.util.stream.Collectors;

/**
 * User: wasu
 * Date: 2020/7/7
 *
 * @author false
 * Description:
 */
@Slf4j
@SuppressWarnings("all")
public class AQSLock {

    /**定义状态*/
    private volatile int state = 0;

    /**持有锁的线程*/
    private Thread threadHolder;

    /**存放获取锁失败的队列*/
    private ConcurrentLinkedQueue<Thread> queue = new ConcurrentLinkedQueue<>();

    /**通过unsafe进程cas操作*/
    private static final Unsafe unsafe = UnsafeInstance.getInstance();

    /**状态值*/
    private static long stateOffSet;
    static {
            try {
                stateOffSet = unsafe.objectFieldOffset(AQSLock.class.getDeclaredField("state"));
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
    }

    /**
     * 加锁操作
     */

    public void lock(){
        if (acquire()){
            return;
        }
        Thread current = Thread.currentThread();
        log.debug("线程状态为：{}",current.getState());
        /**获取锁失败将当前线程放入队列*/
        queue.add(current);
        /**自旋获取锁*/
        for (;;){
            //如果当前线程是栈首对象，并且获取锁成功，则在等待队列中移除栈首对象，否则继续等待。
            if (current == queue.peek() && acquire()){
                queue.poll();
                return;
            }
            //让出cpu资源
            LockSupport.park(current);
        }
    }

    /**
     * 获取锁
     */
    public boolean acquire(){
        int state = getState();
        Thread current = Thread.currentThread();
        boolean waitCondition = queue.size() == 0 || current == queue.peek();
        if (state == 0 && waitCondition){
            /**当前没有线程获取锁*/
            if (compareAndSwapState(0,1)){
                log.info("获取锁成功");
                /**同步修改成功，将线程持有者改为当前线程*/
                setLockHolder(current);
                return true;
            }
        }
        return false;
    }

    /**
     * 释放锁
     */
    public void unlock(){
        //打印等待队列
        System.out.printf("当前等待队列为：%s\n", queue.stream().map(w -> w.getName()).collect(Collectors.toList()));
        //判断释放锁的线程是否为持有锁的线程
        if (Thread.currentThread() != threadHolder){
            throw new RuntimeException("threadHolder is not current thread ！！！");
        }
        //更改state状态
        if (getState() == 1 && compareAndSwapState(1,0)){
            log.info("释放锁成功");
            //将锁的持有线程置为null
            setLockHolder(null);
            //获取队列的第一个线程
            Thread first = queue.peek();
            if (first != null){
                //解除线程的阻塞
                LockSupport.unpark(first);
            }
        }
    }

    /**
     * cas操作
     * @param expect
     * @param update
     * @return
     */
    public final boolean compareAndSwapState(int expect, int update) {
        return unsafe.compareAndSwapInt(this, stateOffSet, expect, update);
    }
    public int getState(){
        return  state;
    }
    public void setLockHolder(Thread threadHolder) {
        this.threadHolder = threadHolder;
    }

   static class UnsafeInstance {
        public static Unsafe getInstance() {
            try {
                Field field = Unsafe.class.getDeclaredField("theUnsafe");
                field.setAccessible(true);
                return (Unsafe) field.get(null);
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                return null;
            }
        }
    }
}
