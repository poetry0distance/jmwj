package com.example.poetry.thread;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/5/9
 * @author false
 * Description:
 */
public class RunThread implements Runnable{

    private boolean isRun = true;
    public void setRun(boolean isRun){
        this.isRun = isRun;
    }

    @Override
    public void run(){
        System.out.println("进入run");
        while (isRun == true){
//            System.out.println("true");
        }
        System.out.println("线程停止");
    }
}
