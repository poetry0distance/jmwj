package com.example.poetry.ola;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * User: wasu
 * Date: 2020/7/6
 *
 * @author false
 * Description: IO 相关操作
 */
public class Ola_IO {

    public static void main(String[] args) {
        try {
            //读取本地文件
            File file = new File("E:\\IOFile\\IOFirst.txt");
            //建立管道读取文件
            FileInputStream fis = new FileInputStream(file);

            //输出文件
            File of = new File("E:\\IOFile\\IOSec.txt");
            FileOutputStream fos = new FileOutputStream(of);

            //操作数据写入新文件
            int length = fis.available();
            System.out.println(fis.read());

            for (int i=0;i<length;i++){
                fos.write(fis.read());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
