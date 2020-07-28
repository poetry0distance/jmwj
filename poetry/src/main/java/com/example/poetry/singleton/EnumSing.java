package com.example.poetry.singleton;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/5/20
 * @author false
 * Description: 枚举单例
 * 1.实例的创建线程安全，确保单例。2.防止被反射创建多个实例。3.没有序列化的问题。
 */
public enum  EnumSing {
    INSTANCE{
        @Override
        protected void work(){
            System.out.println("方法");
        }
    };
    protected abstract void work();
}
