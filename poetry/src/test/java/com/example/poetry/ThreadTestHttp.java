package com.example.poetry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/5/28
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 * Description: 多线程模拟高并发
 */
public class ThreadTestHttp {

    public List dataMap(){
        List rl = new ArrayList();
        Long uid= null;
        for (int i=0;i<50;i++){
            int mas =0;
            if (i<500){
                Map rm = new HashMap();
                mas=(int)((Math.random()*9+1)*1000);
                String l = "210"+ mas;
                uid = Long.valueOf(l);
                rm.put("userId",uid);
                rm.put("type",0);
                rm.put("pageNumber",1);
                rm.put("pageSize",1000);
                rl.add(rm);
            }
        }
        return rl;
    }
    public static void main(String [] args){
        ThreadTestHttp t = new ThreadTestHttp();

        System.out.println(t.dataMap());
    }
}
