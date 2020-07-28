package com.example.poetry.ola;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/6/8
 * Time: 17:00
 * @author false
 * Description: 并发打印 1-100 每个线程打印三个连续数据
 */
public class Ola_T implements Runnable{

    /**最大数*/
    private int Max = 100;
    /**每个线程打印数据*/
    private int SysOut = 3;
    /**当前数据 默认初始化为1*/
    private static int NowNum = 1;
    /**最大线程数*/
    private int n = (int)Math.ceil((float)Max/SysOut);

    /**当前线程ID*/
    private int TID;
    Ola_T(){}
    Ola_T(int TID){
        this.TID = TID;
    }
    @Override
    public void run(){
        synchronized (Ola_T.class){
            while (NowNum <=Max){
                if (NowNum/SysOut%n == TID){
                    System.out.println("Thread -->"+(TID+1));
                    for (int i=0;i<SysOut;i++){
                        if (NowNum >100){
                            break;
                        }
                        System.out.println("  "+NowNum++);
                    }
                    Ola_T.class.notifyAll();
                }else {
                    try {
                        Ola_T.class.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] args){
            Ola_T o = new Ola_T();
            int n = o.n;
            ExecutorService executors = Executors.newCachedThreadPool();
            for (int i = 0;i<n;i++){
                Ola_T ol = new Ola_T(i);
                executors.execute(ol);
            }
            executors.shutdown();
    }
}
