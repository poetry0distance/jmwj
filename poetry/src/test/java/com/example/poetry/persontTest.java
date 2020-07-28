package com.example.poetry;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/2/15
 * Time: 9:07
 * To change this template use File | Settings | File Templates.
 * Description: 按百分比取
 */
public class persontTest {

    //分情况组卷

    public static int num(int n){
        int i = 0;
        for (;;){
            if (i > n){
                return i;
            }
            i++;
        }
    }

    /**
     * 情况1：存在某种题型题库不存在
     * 情况2：相同的百分比如何四舍五入
     * @param args
     */
    public static void main(String[] args){
        System.out.println(num(30));
//        double avg_task = 0.00;
//        int total_task = 33;
//        int total_number = 396;
//        avg_task = Double.parseDouble(String.format("%.2f",Double.valueOf(total_task)/total_number));
//        System.out.println(avg_task);
//        NumberFormat nf = NumberFormat.getInstance();
//        String studyRate = nf.format(9.9*100) +"%";
//        System.out.println(studyRate);
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy");
//        Date date = new Date();
//        String nowDate = sf.format(date);
//        System.out.println(sf.format(date));
//        String str ="Sylvain White,塞尔文·怀特   ";
//        String str1 ="中国,大陆,香港,存在,枪战";
//        String regStartSpace = "^[　 ]*";
//        String regEndSpace = "[ ]*$";
//
//        // 连续两个 replaceAll
//        // 第一个是去掉前端的空格， 第二个是去掉后端的空格
//        str = str.replaceAll(regEndSpace, "");
//        String strDelSpace = str.replaceAll(regStartSpace, "").replaceAll(regEndSpace, "");
//        System.out.println(str + str1);

//        if (str.length()>0){
//            if (str1.length()>0){
//                String[] sourceStrArray = str1.split(",");
//                for (String s:sourceStrArray){
//                    if (str.indexOf(s) !=-1){
//                    }else {
//                        str = str +","+ s;
//                    }
//                }
//                System.out.println(str);
//            }else {
//                System.out.println(str);
//            }
//        }else {
//            System.out.println(str1);
//        }
//        str = str.replace("，",",");
//        if (str.indexOf("电视剧") != -1){
//            System.out.println("包含内容");
//        }else {
//            System.out.println("不包含");
//        }

    }
    public static boolean isNumeric(String str){
        for(int i= str.length(); --i>=0;){
            if( ! Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true ;
    }

    public  static String isPeriod(String str){
        String[] sourceStrArray = str.split(",");
        String returnStr = null;
        List ls = new ArrayList();
        for (String s :sourceStrArray){
            if (s.length() == 9){
                String h = s.substring(0,4);
                String e = s.substring(5,9);
                if (!isNumeric(h) ||  !isNumeric(e)){
                    ls.add(s);
                }
            }else {
                ls.add(s);
            }
        }
        returnStr = listToString2(ls);
        return returnStr ;
    }

    public static String listToString2(List<String> mList) {
        final String SEPARATOR = ",";
        StringBuilder sb = new StringBuilder();
        String convertedListStr = "";
        if (null != mList && mList.size() > 0) {
            for (String item : mList) {
                sb.append(item);
                sb.append(SEPARATOR);
            }
            convertedListStr = sb.toString();
            convertedListStr = convertedListStr.substring(0, convertedListStr.length()
                    - SEPARATOR.length());
            return convertedListStr;
        } else {
            return null;
        }
    }
}
