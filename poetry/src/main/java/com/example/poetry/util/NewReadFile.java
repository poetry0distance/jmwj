package com.example.poetry.util;

import com.alibaba.fastjson.JSON;
import com.example.poetry.service.DistanceService;
import com.example.poetry.service.imp.DistanceServiceImp;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/4/11
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class NewReadFile {

   DistanceService distanceService = new DistanceServiceImp();

    public  void readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                String demoArray[] = tempString.split("\t");
                List ls = Arrays.asList(demoArray);
                String l = ls.get(14).toString();
                ls.set(14,"点播");

                //根据名称转id
                String name = ls.get(1).toString();
                String oldId = ls.get(2).toString();
                String id = distanceService.findId(name);
                if (id==null){
                    ls.set(2,oldId);
                }else {
                    ls.set(2,id);
                }
                //list 转string
                String ss = JSON.toJSONString(ls).replaceAll("[\\[\\]]", "").replace(',','\t');
                String rsd = ss.replace("\"", "");
                FildWrite fildWrite = new FildWrite();
                fildWrite.fileWrid(rsd);
                System.out.println(ss.replace("\"", ""));
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
}
