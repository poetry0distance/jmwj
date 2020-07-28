package com.example.poetry.util;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/6/4
 * Time: 15:33
 * To change this template use File | Settings | File Templates.
 * Description:月份日期
 */
public enum MonthEnum {


    January("Jan","01"),
    February("Feb","02"),
    March("Mar","03"),
    April("Apr","04"),
    May("May","05"),
    June("Jun","06"),
    July("Jul","07"),
    August("Aug","08"),
    September("Sep","09"),
    October("Oct","10"),
    November("Nov","11"),
    December("Dec","12");

    private String name;
    private String num;


    private MonthEnum(String name , String index ){
        this.name = name ;
        this.num = index ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
