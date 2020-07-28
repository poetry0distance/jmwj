package com.example.poetry;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/11/20
 * Time: 15:02
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ThreadDemo implements Runnable{

    private Thread runnable;
    private String threadName;
    public ThreadDemo(String name){
        this.threadName = name;
        System.out.println("threadName:"+threadName);
    }

    public void run(){
        try {
            for (int i=5;i>0 ;i--){
                System.out.println("Thread:"+threadName+","+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread:"+threadName+"exit.");
    }

    public void start(){
        System.out.println("staring:" +threadName);
        if (runnable==null){
            runnable = new Thread(this,threadName);
            runnable.start();
        }
    }
}
