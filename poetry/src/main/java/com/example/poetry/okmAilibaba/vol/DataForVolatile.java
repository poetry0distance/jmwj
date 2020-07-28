package com.example.poetry.okmAilibaba.vol;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * User: wasu
 * Date: 2020/7/7
 * @author false
 * Description:
 */
@SuppressWarnings("all")
public class DataForVolatile {

//    int number=0;

    volatile int number=0;

    AtomicInteger atomicInteger=new AtomicInteger();
    public void setTo60(){
        this.number=60;
    }

    //此时number前面已经加了volatile，但是不保证原子性

    public void addPlusPlus(){
        number++;
    }

    public void addAtomic(){
        atomicInteger.getAndIncrement();
    }
}
