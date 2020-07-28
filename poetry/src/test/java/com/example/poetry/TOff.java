package com.example.poetry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/11/7
 * Time: 15:17
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class TOff {
    //测试一下continue
    public static void main(String [] args){
            int s = 9;
            TOff t = new TOff();
           for (int i =0 ;i<s ;i++){
               System.out.println(t.fb(i));
           }

        }
        //递归实现斐波拉契数列
        public int fb (int n){
        if (n < 0){
            return -1;
        }else if (n==0 || n==1){
            return  1;
        }else {
            return fb(n-1) + fb(n-2);
        }
        }
//        List ls = new ArrayList();
//        ls.add(1);
//        ls.add(2);
//        ls.add(3);
//        ls.add(2);
//        WeakHashMap wk = new WeakHashMap();
//        for(int i=0;i<ls.size();i++){
////            if (ls.get(i).equals(2)){
////                continue;
////            }
//            System.out.println(ls.get(i));
//        }

//    public static void main(String args[]) throws IOException {
//        char c;
//        // 使用 System.in 创建 BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("输入字符, 按下 'q' 键退出。");
//        // 读取字符
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        } while (c != 'q');
//    }
}
