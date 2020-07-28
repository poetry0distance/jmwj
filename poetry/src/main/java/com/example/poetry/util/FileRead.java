package com.example.poetry.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/4/11
 * Time: 15:22
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class FileRead {
    public void findRead(String files){
        // 需要读取的文件，参数是文件的路径名加文件名
        File file = new File(files);
        if (file.isFile()) {
            // 以字节流方法读取文件
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
                // 设置一个，每次 装载信息的容器
                byte[] buf = new byte[1024];
                // 定义一个StringBuffer用来存放字符串
                StringBuffer sb = new StringBuffer();
                // 开始读取数据
                int len = 0;// 每次读取到的数据的长度
                while ((len = fis.read(buf)) != -1) {// len值为-1时，表示没有数据了
                    // append方法往sb对象里面添加数据
                    sb.append(new String(buf, 0, len, "utf-8"));
                }
                // 输出字符串
                System.out.println(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件不存在！");
        }


    }
}
