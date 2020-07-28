package com.example.poetry.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * User: wasu
 * Date: 2020/7/3
 *
 * @author false
 * Description: 两数相加
 */
public class OlaSysArrayCount {
    OlaSysArrayCount(){}

    public List addTwoNumbers(List l1, List l2) {
        List l = new LinkedList();
        for (int i=l1.size();i>0;i--){
            for (int j = l2.size();j>0;j--){
                l.add((int)l1.get(i)+(int)l2.get(j));
            }
        }
        return l;
    }
    public static void main(String[] args) {

        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();
        OlaSysArrayCount o = new OlaSysArrayCount();
        List l = o.addTwoNumbers(l1,l2);
        l.forEach(n -> System.out.println(n));
    }
}
