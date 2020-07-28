package com.example.poetry.okmAilibaba.set;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * User: wasu
 * Date: 2020/7/10
 * @author false
 * Description:
 */
public class CurrentForList {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        List<String> list =Collections.synchronizedList(new ArrayList<>());
//        List<String> list = new CopyOnWriteArrayList<>();
//        for (int i = 0; i <30 ; i++) {

//            new Thread(()->{
//                list.add(UUID.randomUUID().toString().substring(0,8));
//                System.out.println(Thread.currentThread().getName()+"\t"+list);
//            },String.valueOf(i)).start();
//        }

        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        List<String> list = Arrays.asList("a","b","c");
        System.out.println(list);
    }
}
