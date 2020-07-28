package com.example.poetry.ola;

/**
 * User: wasu
 * Date: 2020/7/9
 *
 * @author false
 * Description: 每一个线程有自己的共享变量 ThreadLock
 */
@SuppressWarnings("all")
public class Ola_ThreadLock {

    static class MyThread extends Thread {
        private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 3; i++) {
                threadLocal.set(i);
                System.out.println(getName() + " threadLocal.get() = " + threadLocal.get());
            }
            System.out.println("当前线程的共享内容"+threadLocal.get());
        }

    }

    public static void main(String[] args) {
        MyThread myThreadA = new MyThread();
        myThreadA.setName("ThreadA");

        MyThread myThreadB = new MyThread();
        myThreadB.setName("ThreadB");

        myThreadA.start();
        myThreadB.start();
    }



}
