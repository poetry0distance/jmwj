package com.example.poetry.justdo;


import sun.security.provider.MD5;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/5/14
 * @author false
 * Description:
 */
public class OptionalTest {

    public static void main(String[] args){
        String testS = null;
        ThreadLocal threadLocal = new ThreadLocal();
        Optional l = Optional.ofNullable(testS);
        System.out.println( new java.util.Date());
    }
}
