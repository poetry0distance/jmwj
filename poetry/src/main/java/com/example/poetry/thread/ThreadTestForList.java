package com.example.poetry.thread;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/8/30
 * Time: 10:12
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ThreadTestForList implements Runnable{

    private Thread t;
    private String threadName;

    ThreadTestForList( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }
    @Override
    public void run(){
        try {
            for (int i=0;i<5;i++){
                System.out.println("线程："+threadName+","+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("线程ERROR");
        }
        System.out.println("线程：" +  threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting " +  threadName );
        if (t ==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }

    public static void main(String [] args){
            ThreadTestForList tl = new ThreadTestForList("线程-1");
            tl.start();
            ThreadTestForList t2 = new ThreadTestForList("线程-2");
            t2.start();
    }
}
