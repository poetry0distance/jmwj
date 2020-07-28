package com.example.poetry.thread;

import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/5/13
 * @author false
 * Description:
 */
public class ThreadCallableDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception{
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum += i;
        }
        return sum;
    }
}
