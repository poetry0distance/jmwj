package com.example.poetry.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/5/20
 * @author false
 * Description: 静态内部类 实现线程安全的单例
 */
public class IoDHSing {
    private IoDHSing(){
        System.out.println("构造函数");
    }
    public static IoDHSing getInstance(){
        return IoDHSingHolder.ioDHSing;
    }

    private static class IoDHSingHolder{
        private static IoDHSing ioDHSing = new IoDHSing();
    }
}
