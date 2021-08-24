package com.example.poetry.lru.link;

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
 * @date 2021-08-24
 */
public class LRU<K,V> extends LinkedHashMap<K,V> implements Map<K,V> {

    public LRU(int initialCapacity,
               float loadFactor,
               boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<K,V> eldest){
        if (size() > 5){
            return true;
        }
        return false;
    }
}
