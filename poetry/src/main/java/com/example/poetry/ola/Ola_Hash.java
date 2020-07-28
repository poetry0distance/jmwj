package com.example.poetry.ola;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * User: wasu
 * Date: 2020/6/29
 * @author false
 * Description:
 */
public class Ola_Hash {

    ThreadPoolExecutor tp = new ThreadPoolExecutor(10,20,60, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(100));

    private int hash;
    private char value[]={'q','t','r','i','n','g'};
    @Override
    public int hashCode() {
        int h = hash;
        System.out.println("---start-->"+ h);
        if (h == 0 && value.length > 0) {
            char val[] = value;
            for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
                System.out.println("---init-->"+h);
            }
            hash = h;
        }
        return h;
    }
    public static void main(String[] args){
//        Ola_Hash ol = new Ola_Hash();
//        int a = ol.hashCode();
//        System.out.println(a);
//        ol.tp.shutdown();
        int n = 2;
        System.out.println(15>>1);
        List l = new ArrayList();
    }
}
