package com.example.poetry;

import com.example.poetry.thread.FooUtil;

/**
 * User: wasu
 * Date: 2020/7/7
 *
 * @author false
 * Description:
 */
public class FooTest {

    public static void main(String[] args) {
        FooUtil fooUtil = new FooUtil();
        Thread thread3 = new Thread();
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
