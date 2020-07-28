package com.example.poetry.thread;



/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/5/8
 * @author false
 * Description:
 */
public class ToDu{
    public static void main(String[] args){
        RunThread runThread = new RunThread();
        Thread thread = new Thread(runThread);
        thread.start();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        runThread.setRun(false);
        System.out.println("被设置为false");
    }
}
