package com.example.poetry.thread;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/4/29
 * @author false
 * Description:
 */
public class PoetryThread{


    public void detail(ThreadPoolExecutor threadPool){
        List<?> ll = new ArrayList<>();
//        CountDownLatch latch = new CountDownLatch(5);
        System.out.println("线程池开始时间"+System.currentTimeMillis());
        for (int i=0;i<5;i++){
            threadPool.execute(()->{
                try {
                    //加锁？
                    test();
                }catch (Exception e){
                    e.printStackTrace();
                    System.out.println("线程运行失败");
                }finally {
                    threadPool.shutdown();
                }
            });
        }
        System.out.println("线程池结束时间"+System.currentTimeMillis());
    }
    /**
     * 数据处理方法
     */
    public void test(){
        int c = 0;
        for (int i = 0;i<10000;i++){
            c++;
        }
        System.out.println(c);
    }


    public void test1(){
        System.out.println("非线程池开始时间"+System.currentTimeMillis());
        for (int j=0;j<5;j++){
            test();
        }
        System.out.println("非线程池结束时间"+System.currentTimeMillis());
    }
    public static void main(String[] args){
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5,20,60, TimeUnit.SECONDS,
                new LinkedBlockingDeque<>() ,new ThreadPoolExecutor.CallerRunsPolicy());
        //创建线程
        threadPool.prestartAllCoreThreads();
        PoetryThread poetryThread = new PoetryThread();
        poetryThread.detail(threadPool);
        poetryThread.test1();
    }
}
