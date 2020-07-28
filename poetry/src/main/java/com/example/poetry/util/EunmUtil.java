package com.example.poetry.util;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/6/4
 * Time: 15:41
 * To change this template use File | Settings | File Templates.
 * Description:
 *
 *
 * 一月：January 简写Jan.
 * 二月：February 简写Feb.
 * 三月：March 简写Mar.
 * 四月：April 简写Apr.
 * 五月：May 简写May.
 * 六月：June 简写Jun.
 * 七月：July 简写Jul.
 * 八月：August 简写Aug.
 * 九月：September 简写Sep. / Sept.
 * 十月：October 简写Oct.
 * 十一月：November 简写Nov.
 * 十二月：December 简写Dec.
 */
public enum EunmUtil {

    January("January","01"),
    February("February","02"),
    March("March","03"),
    April("April","04"),
    May("May","05"),
    June("June","06"),
    July("July","07"),
    August("August","08"),
    September("September","09"),
    October("October","10"),
    November("November","11"),
    December("December","12");

    private String name;
    private String num;


    private EunmUtil(String name , String index ){
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
