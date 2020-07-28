package com.example.poetry.util;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/4/22
 * Time: 11:19
 * To change this template use File | Settings | File Templates.
 * Description: 实现runnable接口 创建多线程
 */
public class NewThread implements Runnable{
    Thread t;
    public NewThread() {
        // 创建第二个新线程
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); // 开始线程
    }
    // 第二个线程入口

    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                // 暂停线程
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
