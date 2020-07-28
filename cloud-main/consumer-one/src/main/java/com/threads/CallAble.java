package com.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantLock;

/**
 * User: wangtao
 * Date: 2020/7/23
 *
 * @author false
 * Description:
 */
public class CallAble {

   static class ThreadDemo implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            int num = 0;
            for (int i = 0; i <10000 ; i++) {
                num+=i;
            }
            return num;
        }
    }
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        ThreadDemo td = new ThreadDemo();
        FutureTask<Integer> futureTask = new FutureTask<>(td);

        new Thread(futureTask).start();
        try {
            /**子线程执行完毕才会执行get方法*/
            Integer n = futureTask.get();
            System.out.println("******--->"+n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
