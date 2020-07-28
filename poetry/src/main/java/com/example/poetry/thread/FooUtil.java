package com.example.poetry.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * User: wasu
 * Date: 2020/7/7
 *
 * @author false
 * Description: 按顺序执行 1 2 3 方法
 */
@SuppressWarnings("all")
public class FooUtil{

    //定义两个初始变量
    private AtomicInteger f = new AtomicInteger(0);
    private AtomicInteger s = new AtomicInteger(0);
    public FooUtil(){}

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        f.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (f.get() != 1){

        }
        printSecond.run();
        s.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (s.get() != 1){

        }
        printThird.run();
    }

}
