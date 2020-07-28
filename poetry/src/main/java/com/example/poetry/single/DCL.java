package com.example.poetry.single;

/**
 * User: wasu
 * Date: 2020/7/8
 *
 * @author false
 * Description: 单例模式的双端检索样例
 */
@SuppressWarnings("all")
public class DCL {

    //加volatile 为了防止指令重排
    private static volatile DCL dcl= null;

    private DCL(){}

    public static DCL getInstance(){
        if (dcl == null){
            synchronized (DCL.class){
                if (dcl == null){
                    dcl = new DCL();
                }
            }
        }
        return dcl;
    }
}
