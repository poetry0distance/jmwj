package com.example.poetry.ola;

import java.util.concurrent.*;

/**
 * User: wasu
 * Date: 2020/7/2
 * @author false
 * Description:
 */
public class Ola_Thread implements Runnable{

    private static int si=1;
    private int id;
    Ola_Thread(int id){
        this.id = id;
    }

    @Override
    public void run(){
        synchronized (Ola_Thread.class){
            while (si <= 100){
                if (si/3%34 == id){
                    System.out.println("Thread-"+ (id+1)+"--->");
                    for (int i = 0;i<3;i++){
                        if (si > 100){
                            break;
                        }
                        System.out.println("  "+si++);
                    }
                    System.out.println();
                    Ola_Thread.class.notifyAll();
                }else {
                    try {
                        Ola_Thread.class.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0;i<34;i++){
            Ola_Thread o = new Ola_Thread(i);
            executorService.execute(o);
        }
        executorService.shutdown();
    }
}
