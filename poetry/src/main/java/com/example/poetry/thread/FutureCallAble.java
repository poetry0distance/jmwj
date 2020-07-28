package com.example.poetry.thread;

import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/5/12
 * @author false
 * Description: 线程结果获取 线程池处理，暂时未解决
 */
public class FutureCallAble {


    public static void main(String[] args){
        ThreadCallableDemo td = new ThreadCallableDemo();
        ThreadPoolExecutor te = new ThreadPoolExecutor(10,20,
                    60, TimeUnit.SECONDS,
                                new LinkedBlockingDeque<>(),
                                new ThreadPoolExecutor.CallerRunsPolicy());
        //执行callAble 需要借助于 futureTask 实现类 接收运算结果

        FutureTask<Integer> rt= new FutureTask<>(td);

        //接收线程运算结果
        try {
            //FutureTask 可用于 闭锁 类似于CountDownLatch的作用，在所有的线程没有执行完成之后这里是不会执行的
            Integer sum = rt.get();
            System.out.println(sum);
            System.out.println("--------------------");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}
