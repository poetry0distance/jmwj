package com.example.poetry.leetcode;

/**
 * User: wasu
 * Date: 2020/7/3
 *
 * @author false
 * Description: 整数倒转
 */
public class NotRepString {
    NotRepString(){}
    public int lengthOfLongestSubstring(int x) {
        int res = 0 ;
        while(x != 0){
            int temp = x % 10 + res * 10;
            //最关键的一步
            if((temp - x % 10) / 10 != res){
                return 0 ;
            }
            res = temp ;
            x /= 10 ;
        }
        return res ;
    }

    public static void main(String[] args) {
        NotRepString no = new NotRepString();
        int s = (int)Math.pow(2,31)+1;
        int n = no.lengthOfLongestSubstring(s);
        System.out.println(n);
    }
}
