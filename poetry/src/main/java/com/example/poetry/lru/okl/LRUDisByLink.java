package com.example.poetry.lru.okl;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Title: EMP </p>
 * Description: <br>
 * Copyright: CorpRights terminus.io<br>
 * Company: terminus.io<br>
 *
 * @author wang.tao
 * @version 1.0-SNAPSHOT
 * @date 2021-08-25
 * 基于linkHashMap 实现lru的基本思想
 * lru淘汰最近最少使用的
 */
public class LRUDisByLink<K,V> extends LinkedHashMap<K,V> {

    private int capacity;

    public LRUDisByLink(int capacity){
        // true / false 决定是从头节点抛出还是尾节点抛出
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return super.size() > capacity;
    }

    public static void main(String[] args) {
        LRUDisByLink<Object, Object> link = new LRUDisByLink<>(3);
        link.put(1,1);
        link.put(2,2);
        link.put(3,3);
        System.out.println(link.keySet());
        link.put(4,4);
        System.out.println(link.keySet());
        link.put(1,1);
        System.out.println(link.keySet());
    }

}
