package com.util;

import java.io.*;

/**
 * User: wangtao
 * Date: 2020/8/7
 * @author false
 * Description:
 */
public class FileUtil {
    public static void main(String[] args) {
        readFile();
//        writeFile();
    }

    /**
     * 写，文件输入
     */
    public static void writeFile(){
        String s = "java io try write!";
        byte b[] = new byte[1024];
        b = s.getBytes();
        //true 表示在文件后新增内容，不会覆盖已存在内容
        try {
            FileOutputStream fo = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\file.txt",true);
            fo.write(b);
            fo.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(){
        try {
            FileInputStream fi = new FileInputStream("C:\\Users\\Administrator\\Desktop\\file.txt");
            InputStreamReader ir = new InputStreamReader(fi,"GBK");
            BufferedInputStream bf = new BufferedInputStream(fi);
            BufferedReader br = new BufferedReader(new InputStreamReader(bf,"GBK"));
            int c = 0;
            String l = null;
            while ((c = ir.read()) != -1){
                System.out.println((char)c);
            }
            fi.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
