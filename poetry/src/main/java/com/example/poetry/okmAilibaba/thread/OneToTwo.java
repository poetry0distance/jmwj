package com.example.poetry.okmAilibaba.thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.concurrent.Executors.defaultThreadFactory;


/**
 * User: wasu
 * Date: 2020/7/13
 * @author false
 * Description: 1- 100 两个线程交替打印
 */
@SuppressWarnings("all")
public class OneToTwo {

    static class MyThreadData implements Runnable{
        private int threadId;
        private volatile AtomicInteger n ;
        MyThreadData(int threadId,AtomicInteger n){
            this.threadId = threadId;
            this.n = n;
        }
        @Override
        public void run() {
            while (n.get() <= 100){
                pring(threadId,n.get());
            }
        }

        public void pring(int i,int j){
            synchronized (MyThreadData.class){
                try {
                    if (j%2 == 1){
                        if (i == 1){
                            System.out.println("Thread--"+i+"-->"+"num "+j);
                            n.incrementAndGet();
                            MyThreadData.class.notifyAll();
                        }else {
                            MyThreadData.class.wait();
                        }
                    }else {
                        if (i == 2){
                            System.out.println("Thread--"+i+"-->"+"num "+j);
                            n.incrementAndGet();
                            MyThreadData.class.notifyAll();
                        }else {
                            MyThreadData.class.wait();
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
//        ExecutorService e = Executors.newCachedThreadPool();
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(3,10,0L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                defaultThreadFactory());
        AtomicInteger n = new AtomicInteger(1);
        for (int i = 1; i <=2 ; i++) {
            MyThreadData o = new MyThreadData(i,n);
            tpe.execute(o);
        }
        tpe.shutdown();
    }
}
