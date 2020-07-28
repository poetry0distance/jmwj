package com.example.poetry.util;


import com.alibaba.fastjson.JSON;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/4/11
 * Time: 15:22
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class FildWrite {
    public void fileWrid(String sb){

        File file=new File(sb);
        BufferedReader read=null;
        BufferedWriter writer=null;
        try {
            //开发的时候将文件保存路径放在配置文件里面去配置
            writer=new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\csl.jsp"));
           // writer=new BufferedWriter(new FileWriter("/fileService/data.jsp"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            read=new BufferedReader(new  FileReader(file));
            String tempString = null;
           while((tempString=read.readLine())!=null){
               String demoArray[] = tempString.split("\t");
               List ls = Arrays.asList(demoArray);
               String l = ls.get(14).toString();
               ls.set(14,"点播");
               //list 转string
               String ss = JSON.toJSONString(ls).replaceAll("[\\[\\]]", "").replace(',','\t');
               String rsd = ss.replace("\"", "");

                writer.append(rsd);
                writer.newLine();//换行
                writer.flush();//需要及时清掉流的缓冲区，万一文件过大就有可能无法写入了
            }
            read.close();
            writer.close();
            System.out.println("文件写入完成...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
