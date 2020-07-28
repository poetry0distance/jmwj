package com.example.poetry.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/5/20
 * @author false
 * Description: 双重校验锁模式 (懒汉模式的一种变形)
 * 如果你的Singleton类实现了Serializable序列化接口，
 * 那么可能会被序列化生成多个实例，因为readObject()方法一直返回一个新的对象
 */
public class DCLSing {

    // volatile 禁止指令重排序，安全的实现单例

    private volatile static DCLSing dclSing = null;

    private DCLSing(){
        System.out.println("构造方法");
    }
    public static DCLSing getInstance(){
        if (dclSing == null){
            synchronized (DCLSing.class){
                if (dclSing == null){
                    dclSing = new DCLSing();
                }
            }
        }
        return dclSing;
    }
}
