package com.example.poetry.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/5/20
 * @author false
 * Description: 饿汉模式
 *     在ClassLoader加载Singleton类时，饿汉式单例就被创建
 */
public class ESing {

    private static ESing eSing = new ESing();

    private ESing(){
        System.out.println("构造方法");
    }

    public static ESing getInstance(){
        return eSing;
    }

}
