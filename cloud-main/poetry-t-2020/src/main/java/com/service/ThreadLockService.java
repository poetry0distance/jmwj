package com.service;


import java.util.ArrayList;
import java.util.List;

/**
 * User: wangtao
 * Date: 2020/8/25
 * @author false
 * Description:
 */
public class ThreadLockService {
    private List<String> messages = new ArrayList<>();

    public static final ThreadLocal<ThreadLockService> holder = ThreadLocal.withInitial(ThreadLockService::new);

    public static void add(String message) {
        holder.get().messages.add(message);
    }

    public static List<String> clear() {
        List<String> messages = holder.get().messages;
        holder.remove();
        System.out.println("size: " + holder.get().messages.size());
        return messages;
    }

    public static void main(String[] args) {
        ThreadLockService.add("out of the distance");
        System.out.println(holder.get().messages);
        ThreadLockService.clear();
    }

}
