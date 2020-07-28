package com.zwx.concurrent;

import com.example.poetry.bean.User;
import org.openjdk.jol.info.ClassLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Lia {
    public static void main(String[] args) throws InterruptedException {
        //默认延迟4s才会开启偏向锁，休眠5s确保开启偏向锁
        Thread.sleep(5000);
        List<User> list = new ArrayList<>();
        new Thread(()->{
            for (int i=0;i<20;i++){
                //这里必须要new不同的对象，不能共用同一个对象
                User user = new User();//只是一个空对象
                synchronized (user){
                    list.add(user);
                    System.out.println("t1线程第" + (i+1) + "对象:" + ClassLayout.parseInstance(user).toPrintable());
                }
            }
        },"t1").start();

        try {
            //确保t1创建对象完毕
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------------------------------------");
        new Thread(()->{
            for (int j=0;j<20;j++){
                User user = list.get(j);
                synchronized (user){
                    System.out.println("t2线程第" + (j+1) + "对象:" + ClassLayout.parseInstance(user).toPrintable());
                }
            }
        },"t2").start();
    }
}