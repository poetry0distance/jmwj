package com.example.poetry;

import com.example.poetry.ola.Ola_T;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/6/8
 * @author false
 * Description:
 */
public class Ola_Thread {



    public static void main(String [] args)throws Exception{
        Thread thread = new Thread();
        thread.start();
        System.out.println(Thread.currentThread().getName());
        Thread thread1 = new Thread();
        thread1.start();
//        thread.interrupt();
//        Thread.sleep(500);
        thread1.setName("滴滴滴");
        thread1.join();
        System.out.println(thread1.currentThread().getName());
//        System.out.println(thread.isInterrupted());
    }
}
