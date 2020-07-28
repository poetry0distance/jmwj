package com.example.poetry.thread;

import sun.misc.Unsafe;

/**
 * User: wasu
 * Date: 2020/7/7
 *
 * @author false
 * Description:
 */
@SuppressWarnings("all")
public class SFoo {

    private int n;
    private volatile int m = 2*n;

    public SFoo(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        if (m%2 == 1 && m > 0){
            for (int i = 0; i < n; i++) {
                printFoo.run();
                System.out.println("foo");
                continue;
            }
            m --;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        if (!(m%2 == 1) && m > 0){
            for (int i = 0; i < n; i++) {
                printBar.run();
                System.out.println("bar");
                continue;
            }
            m --;
        }
    }
}
