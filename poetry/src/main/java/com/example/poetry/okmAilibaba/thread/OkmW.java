package com.example.poetry.okmAilibaba.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * User: wasu
 * Date: 2020/7/10
 *
 * @author false
 * Description:
 */
@SuppressWarnings("all")
public class OkmW {

   static class myThread implements Runnable{
        @Override
        public void run(){
            synchronized (myThread.class) {
                try {
                    Thread.currentThread().setName("线程名");
                    if (Thread.currentThread().getId() == 12){
                        myThread.class.wait();
                    }else {
                        myThread.class.notifyAll();
                    }
                    System.out.println(Thread.currentThread().getPriority()+" 优先级");
                    System.out.println("----->" + Thread.currentThread().getId());
                } catch (Exception e) {

                }
            }
        }
    }

    public static void main(String[] args){
        ExecutorService e = Executors.newCachedThreadPool();
        for (int i = 0; i <5 ; i++) {
            myThread thread = new myThread();
            e.execute(thread);
        }
        e.shutdown();
    }
}
