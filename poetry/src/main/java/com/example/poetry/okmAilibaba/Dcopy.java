package com.example.poetry.okmAilibaba;

import com.example.poetry.bean.CopyPerson;
import com.example.poetry.bean.MapEntitySize;
import org.apache.naming.factory.BeanFactory;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * User: wangtao
 * Date: 2020/7/15
 *
 * @author false
 * Description: 深拷贝/浅拷贝
 */
@SuppressWarnings("all")
public class Dcopy {


    public <T> T copy(T source) throws IllegalAccessException {
        T ct =(T) new Object();
//        Field[] cp = source.getClass().getDeclaredFields();
//        Object obj = new Object();
//        for (Field f:cp) {
//            f.setAccessible(true);
//            Object v = f.get(source);
//
//        }
        return ct;
    }



    public static void main(String[] args) throws ClassNotFoundException {


//        AtomicInteger i = new AtomicInteger(1);
//        AtomicStampedReference<AtomicInteger> p = new AtomicStampedReference<>(i,1);
//        p.set(i,2);
//        System.out.println(p.getStamp());
//        Map<String,Object> m = new HashMap<>();
//
//        for (;;){
//            i.incrementAndGet();
//            if (i.get()> 10){
//                break;
//            }
//        }
//        System.out.println(i.get());
//        Dcopy dc = new Dcopy();
//        CopyPerson person = new CopyPerson("ww","2");
//        CopyPerson ps = dc.copy(person);
//
//        System.out.println(person);
//        System.out.println(ps);

        CopyPerson personClass = new CopyPerson("fs","22");
        /**反射实现方式*/
        Class clazz = CopyPerson.class;
        Class c = personClass.getClass();
        //最安全最高效。
        Class cp = Class.forName("com.example.poetry.bean.CopyPerson");

        /**通过构造方法实现深拷贝*/
        CopyPerson person = new CopyPerson("qqq","22");
        CopyPerson p2 = (CopyPerson) person.clone();
        System.out.println(person);
        System.out.println(p2);

        System.out.println("==========");

        person.setAge("2222");

        System.out.println(person);
        System.out.println(p2);

    }


}
