package com.example.poetry.util;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/6/17
 * Time: 14:38
 *
 * @author false
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class LurUtil<K,V> extends LinkedHashMap<K,V> {

    private final int CACHE_SIZE;
    public LurUtil(int cacheSize){
        super((int)Math.ceil(cacheSize/0.75)+1,0.75f,true);
        CACHE_SIZE = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry entry){
        return size()>CACHE_SIZE;
    }
}
