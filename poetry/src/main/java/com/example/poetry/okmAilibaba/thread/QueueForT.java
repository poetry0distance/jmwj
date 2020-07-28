package com.example.poetry.okmAilibaba.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * User: wasu
 * Date: 2020/7/13
 * @author false
 * Description:
 */
public class QueueForT {


    public static void main(String[] args) {
        AtomicInteger n = new AtomicInteger(1);
        Object obj = "";
        new Thread(()->{
            while (n.get() <=100) {
                synchronized (obj){
                if (n.get() % 2 == 1) {
                    System.out.println("Thread-->" + Thread.currentThread().getName() + " " + "Num " + n.get());
                    n.incrementAndGet();
                    obj.notifyAll();
                } else {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
               }

            }
        },"no1").start();
        new Thread(()->{
            while (n.get() <= 100) {
                synchronized (obj) {
                    if (n.get() % 2 == 0) {
                        System.out.println("Thread-->" + Thread.currentThread().getName() + " " + "Num " + n.get());
                        n.incrementAndGet();
                        obj.notifyAll();
                    } else {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        },"no2").start();
    }
}
