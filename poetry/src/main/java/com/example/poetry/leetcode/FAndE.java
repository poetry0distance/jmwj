package com.example.poetry.leetcode;

/**
 * User: wasu
 * Date: 2020/7/3
 *
 * @author false
 * Description:回文数字 未完待续
 */
public class FAndE {

    FAndE(){}
    @SuppressWarnings("all")
    public boolean s(int x){
        if (x < 0 || (x%10==0 && x!=0)){
            return false;
        }
        int rn = 0;
        while (x > rn){
            rn = rn*10+x%10;
            x/=10;
        }
        return x==rn || x==rn/10;// 偶数个 奇数个
    }
    public static void main(String[] args) {
        FAndE f = new FAndE();
        int i = 12321;
        System.out.println(f.s(i));
    }
}
