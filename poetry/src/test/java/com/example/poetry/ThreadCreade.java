package com.example.poetry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/12/12
 * Time: 16:28
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ThreadCreade {

    public static void main(String[] args){

    }
    public List<Map<String,Object>> cred(){
        List<Map<String,Object>> rl = new ArrayList<>();
        for (int i=0;i<10;i++){
            Map<String,Object> rm = new HashMap<>();
            rm.put("code",i);
        }
        return rl;
    }
}
