package com.example.poetry.ola;

import java.util.ArrayList;
import java.util.List;

/**
 * User: wasu
 * Date: 2020/7/6
 *
 * @author false
 * Description: NIO 相关操作
 */
public class Ola_NIO {

    /**读操作*/
    @SuppressWarnings("unused")
    public static void read(String path){

    }
    @SuppressWarnings("all")
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        int i = l.set(1,5);
        System.out.println(i);
    }
}
