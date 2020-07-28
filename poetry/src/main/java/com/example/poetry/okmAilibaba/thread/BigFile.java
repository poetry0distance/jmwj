package com.example.poetry.okmAilibaba.thread;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/**
 * User: wangtao
 * Date: 2020/7/16
 *
 * @author false
 * Description: 10G 文件取最大数
 */
public class BigFile {

    public static void main(String[] args) throws IOException {
        BigFile bf = new BigFile();

        BufferedInputStream bi = new BufferedInputStream(new FileInputStream("C:\\\\Users\\\\Administrator\\\\Desktop\\\\bigFile.txt"));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\bigFile.txt"));

        byte[] bytes = new byte[4];
        while (bi.read(bytes,0,bytes.length) !=-1){
            bf.maxNum(bytes);
        }
        bi.close();

    }

    public AtomicReference<Set<Integer>> maxNum(byte[] bytes){
        AtomicReference<Set<Integer>> maxNum = new AtomicReference<>();
        num(bytes);
        return maxNum;
    }

    public List<Integer> num(byte[] bytes){
        List<Integer> l = new ArrayList<>();
        byte[] bytes1= new byte[bytes.length];
        for (int i = 0; i < bytes1.length; i++) {
            bytes1[i]=bytes[i];
            System.out.println(new BigInteger(bytes1).intValue());
        }
        return l;
    }
}
