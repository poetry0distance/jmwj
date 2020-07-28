package com.example.poetry.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/5/20
 * @author false
 * Description: 单例懒汉模式
 */
public class LazySing {

    private static LazySing lazySing = null;

    private LazySing(){
        System.out.println("构造函数调用");
    }

    public static LazySing getInstance(){
        if (lazySing == null){
            lazySing = new LazySing();
        }
        return lazySing;
    }
}
