package com.example.poetry.lru.link;

import com.example.poetry.lru.LRUCache;

import java.util.Map;

/**
 * <p>Title: EMP </p>
 * Description: <br>
 * Copyright: CorpRights terminus.io<br>
 * Company: terminus.io<br>
 *
 * @author wang.tao
 * @version 1.0-SNAPSHOT
 * @date 2021-08-24
 */
public class MainClazz {

    public static void main(String[] args) {
        /**
         * 基于linkHashMap的实现
         */
//        LRU<Character, Integer> lru = new LRU<Character, Integer>(
//                16, 0.75f, true);
//
//        String s = "abcdefghijkl";
//        for (int i = 0; i < s.length(); i++) {
//            lru.put(s.charAt(i), i);
//        }
//        System.out.println("LRU ：" + lru);

        LRUCache ext = new LRUCache(3);
        ext.put(1,1);
        ext.put(2,2);
        ext.put(3,3);
        ext.put(4,4);
        ext.put(5,5);

        
    }
}
