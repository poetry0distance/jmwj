package com.example.poetry.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * User: wasu
 * Date: 2020/7/6
 *I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * @author false
 * Description: 罗马字符转数字
 */
public class CharToNum {

    public int num(String s){
        Map<String,Object> m = new HashMap<>();
        m.put("I",1);
        m.put("V",5);
        m.put("X",10);
        m.put("L",50);
        m.put("C",100);
        m.put("D",500);
        m.put("M",1000);
        char[] c = s.toCharArray();
        for (int i=0;i<c.length;i++){
            String ls = String.valueOf(c[i]);
            if (m.get(ls)!=""){

            }
        }
        return 1;
    }
    public static void main(String[] args) {

    }
}
