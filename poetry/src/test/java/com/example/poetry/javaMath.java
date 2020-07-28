package com.example.poetry;


import com.example.poetry.service.DistanceService;
import com.example.poetry.service.imp.DistanceServiceImp;
import com.example.poetry.util.DataUtil;
import com.example.poetry.util.FildWrite;
import com.example.poetry.util.FileRead;
import com.example.poetry.util.NewReadFile;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/3/14
 * Time: 10:59
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class javaMath {

    private final Log logger = LogFactory.getLog(javaMath.class);
    public static void main(String[] args) throws IOException{

        String path = "E:\\logdata\\t1.log";
        RandomAccessFile br = new RandomAccessFile(path, "r");// 这里rw看你了。要是之都就只写r
        String str = null;
        String app = null;
        int i = 0;
        while ((str = br.readLine()) != null) {
            i++;
            app = app + str;
            if (i >= 100) {// 假设读取100行
                i = 0;
                // 这里你先对这100行操作，然后继续读
                app = null;
            }
        }
        br.close();


}

    public void FileDetail(String r_url,String w_url) throws IOException {

        logger.info("数据处理开始！"+"-----"+"文件绝对路径:"+r_url);
        int count =1;
        FileInputStream file = new FileInputStream(r_url);
        DataUtil dataUtil = new DataUtil();
        RandomAccessFile read=null;
        PrintWriter out = null;
        try {
            read=new RandomAccessFile(new File(r_url),"r");
            out = new PrintWriter(w_url);
            String tempString = null;

            while((tempString=read.readLine())!=null){
                String demoArray[] = tempString.split("\\|");
                List ls = Arrays.asList(demoArray);
                String dataS = ls.get(1).toString();
                //判断 dataS 格式
                if (dataUtil.isOkStr(dataS)){
                    String demoArrays[] = dataS.split(" ");
                    List lss = Arrays.asList(demoArrays);
                    String oldData = lss.get(0).toString();
                    String newData = dataUtil.dataFormatCon(oldData);
                    tempString = tempString.replace(dataS, newData);
                    String line = System.getProperty("line.separator");
                    out.write(tempString+line);
                }else {
                    String line = System.getProperty("line.separator");
                    out.write(tempString+line);
                }
                count ++;
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        file.close();
        read.close();
        out.close();
        logger.info("数据处理结束");
        String sep = System.getProperty("file.separator");
        File fs = new File(r_url);
        String filename = fs.getName();
        String pathRoot = fs.getParent();
        fs.delete();
        File fw = new File(w_url);
        String fwName = fw.getName();
        File newF = new File(pathRoot+sep+filename);
        fw.renameTo(newF);
    }

}