package com.example.poetry.cas;

import com.example.poetry.bean.User;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * User: wasu
 * Date: 2020/7/8
 * @author false
 * Description:
 */
public class CASDemo {

    static class User{
        private String name;
        private int age;
        private User(String name,int age){
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        User user  = new User("wt",20);
        AtomicReference<User> atomicReference = new AtomicReference<>();
        int a = 0;
        do {
            System.out.println(a);
            a++;
        }while (a < 10);
        System.out.println(a);
    }
}
