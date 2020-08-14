package com.service;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * User: wangtao
 * Date: 2020/8/6
 *
 * @author false
 * Description:
 */
public class DoMainService {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);

    }
}
