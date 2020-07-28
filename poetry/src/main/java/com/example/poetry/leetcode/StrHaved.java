package com.example.poetry.leetcode;

/**
 * User: wasu
 * Date: 2020/7/6
 *
 * @author false
 * Description:
 */
@SuppressWarnings("all")
public class StrHaved {


    StrHaved(){}
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        //第一个字符串 依次为依据
        int fLength = strs[0].length();
        //多少个字符串
        int count = strs.length;
        for (int i=0;i<fLength;i++){
            char c = strs[0].charAt(i);
            for (int j = 1;j<count;j++){
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
    public static void main(String[] args) {
        StrHaved s = new StrHaved();
        String[] strings = {"asdfmlo","asdfglk","asdfcvb","asdfvbx"};
        String rs= s.longestCommonPrefix(strings);
        System.out.println(rs);
    }
}
