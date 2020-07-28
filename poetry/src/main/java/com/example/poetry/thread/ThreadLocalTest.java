package com.example.poetry.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/5/13
 * @author false
 * Description:
 */
public class ThreadLocalTest {

    private List<String> messages = new ArrayList<>();

    public static final ThreadLocal<ThreadLocalTest> holder = ThreadLocal.withInitial(ThreadLocalTest::new);

    public static void add(String message){
        holder.get().messages.add(message);
    }

    public static List<String> clear(){
        List<String> messages = holder.get().messages;
        holder.remove();
        System.out.println("size: "+holder.get().messages.size());
        return messages;
    }

    public static void main(String[] args){
//        ThreadLocalTest.add("现在我正坐在电脑前 今天的天气不错");
//        System.out.println(holder.get().messages);
//        ThreadLocalTest.clear();
        int n=10;
        int m = n >> 4;
        System.out.println(m);
        for(int i = 31;i >= 0; i--){
            System.out.print(n >>> i & 1);
        }
        System.out.println("-------");
        for(int i = 31;i >= 0; i--){
            System.out.print(m >>> i & 1);
        }
    }

}
