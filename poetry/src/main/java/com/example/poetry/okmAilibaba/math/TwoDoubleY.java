package com.example.poetry.okmAilibaba.math;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * User: wangtao
 * Date: 2020/7/31
 *
 * @author false
 * Description:
 */
public class TwoDoubleY {

    public static void main(String[] args) {
        StringBuilder sbs = new StringBuilder();
        sbs.append("select dict_value from sys_dict_code where dict_type='BITRATEINTERVAL'");
        sbs.append(" and dict_code in(");
        String bitrateCode = "1,6,8";
        StringBuilder sb = new StringBuilder();
        String[] s = bitrateCode.split(",");
        for (String sl:s){
            sb.append(sl+",");
        }
        String a = sb.substring(0, sb.lastIndexOf(","));
        sbs.append(a).append(" )");
        System.out.println(sbs.toString());
//        String s = "950<=x<1450";
//        String sb = s.replace("x", " t1.asset_bitrate/1000 and t1.asset_bitrate/1000 ");
//        System.out.println(sb);
//        List<String> ls = new ArrayList<>();
//        List<String> lw = new ArrayList<>();
//        List<String> lq = new ArrayList<>();
//        ls.add("q");
//        ls.add("w");
//        lw.add("e");
//        lw.add("r");
//        lq.addAll(ls);
//        lq.addAll(lw);
//        System.out.println(ls);
//        System.out.println(lw);
//        System.out.println(lq);

//        int num = -16;
//        TwoDoubleY t = new TwoDoubleY();
//        String s = Integer.toBinaryString(Math.abs(num));
//        System.out.println(s);

    }

    public boolean checkNum(int num){
        boolean t = false;
        if (num== 2 || num == 1){
            t = true;
            return t;
        }
        String s =null;
        while (num>0){
            int n = num%2;
            num = n;
            s +=n+",";
        }
        return t;
    }

    public String s(int num){
        String s ="";
        while (num>0){
            int n = num/2;
            num = n;
            s +=n+",";
        }
        return s;
    }
}
