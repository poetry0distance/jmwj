package com.example.poetry.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/6/4
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class DataUtil {

    private final Log logger = LogFactory.getLog(DataUtil.class);
    /**
     * 时间格式转换方法
     */
    public String dataFormatCon(String s){
        String ls = s.replace("/",":");
        String demoArrays[] = ls.split(":");
        List lss = Arrays.asList(demoArrays);

        String y = lss.get(1).toString();
        String rs = MonthEnum.valueOf(y).getNum();


        String data = lss.get(2).toString() +
                rs+
                lss.get(0).toString()+
                lss.get(3).toString()+
                lss.get(4).toString()+
                lss.get(5).toString();
        return data;
    }
    /**
     * 字符串格式判断
     */
    public boolean isOkStr(String str){
        String l = str.substring(str.length()-5,str.length());
        if (l.equals("+0800")){
            return true;
        }else {
            return false;
        }
    }
}
