package com.example.poetry;

import com.example.poetry.service.DistanceService;
import com.example.poetry.service.imp.DistanceServiceImp;
import com.example.poetry.util.DistanceUtil;
import com.example.poetry.util.EunmUtil;
import com.example.poetry.util.FileRead;
import com.example.poetry.util.RedisUtil;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.io.*;
import java.lang.reflect.Array;
import java.net.InetAddress;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.function.IntBinaryOperator;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/5/28
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class mathTest {

//    public String ip() throws IOException {
//        String path = mathTest.class.getClassLoader().getResource("data.properties").getPath();
//        FileInputStream in = new FileInputStream(path);
//        Properties prop = new Properties();
//        prop.load(in);
//        String s = prop.getProperty("ip_white");
//        return s;
//    }
    public String ssr(String s){
        String sss= null;
        try {
            while (1==1){
                sss="shuchu1";
                return sss;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String rs = c.toString();
        return sss;
//        return rs;
    }
    public static void main(String[] args) throws IOException{

//        String i = "1572489402000";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String date = simpleDateFormat.format(new Date(Long.parseLong(i)));
//        System.out.println(System.currentTimeMillis());
//        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
//        String s = df.format(new Date());
//        System.out.println(s);// new Date()为获取当前系统时间
//            String s = "/data/ttf/ccg";
//            if (s.endsWith("/")){
//            }else {
//                s+="/";
//            }
//        System.out.println(s);

//        String s = "15605885585;15620710495";
//        String[] sl = s.split(";");
//        List<String> l = Arrays.asList(sl);
//        System.out.println(l);
//        for (String sll:l){
//            System.out.println(sll);
//        }
//        String s = "wangtao@wasu.com;986252887@qq.com";
//        String[] ss = s.split(";");
//        List l = new ArrayList();
//        for (String ls:ss){
//            System.out.println('"'+ls+'"');
//            l.add(ls);
//        }
//        String s = "D,C,F#A#B,B";
//        List<String> ss = Arrays.asList(s.split(","));
//        for (int i=0;i<ss.size();i++){
//            String sss = ss.get(i);
//            String rs = sss.replace("#",",");
//            System.out.println(rs);
//        }
//        Map rm  = new HashMap();

//        String s = "[15620710495;19987287783]";
//        String lsa = s.replaceAll("^[\\[]*","").replaceAll("[\\]]*$","");
//        System.out.println(lsa);
//        String [] a = s.split(";");
//        List<String> ls = Arrays.asList(a);
//        System.out.println(ls);
//        try {
//            InetAddress ia= InetAddress.getLocalHost();
//            String localname=ia.getHostName();
//            String localip=ia.getHostAddress();
//            System.out.println(localip);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        String s = "bic";
//        String bs = s.toUpperCase();
//        System.out.println(bs);
//        Date date=null;
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        String ls = df.format(new Date(Long.valueOf(s)));
//        System.out.println(ls);
//        try {
//             date = df.parse(s);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        String ls = df.format(date);
//        System.out.println(ls);

//        String s = "checks.xml";
//        String ls = s.substring(s.length()-5);
//        String rs = s.replace(ls,"");
//        System.out.println(rs);

//        String s = "D,C,A,B";
//        String ls = s.replaceAll(",","");
//        char[] c = ls.toCharArray();
//        Arrays.sort(c);
//        StringBuffer sb = new StringBuffer();
//        for (char b:c){
//                sb.append(b);
//        }
//        String pps = sb.toString();
//        String lps = pps.replaceAll("",",").substring(1);
//        System.out.println(lps);
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
//        String nowData = df.format(new Date());
//        System.out.println(nowData);


//        mathTest mathTest = new mathTest();
//        System.out.println(mathTest.ip());
//        String[] atp = {"Rafael Nadal", "Novak Djokovic",
//                "Stanislas Wawrinka",
//                "David Ferrer","Roger Federer",
//                "Andy Murray","Tomas Berdych",
//                "Juan Martin Del Potro"};
//        List<String> players =  Arrays.asList(atp);
//
//        //players.forEach((player) -> System.out.print(player + "; "));
//
//        String sss = "";
//        IntBinaryOperator intBinaryOperator = (int x, int y) -> 5 + 6;
//        System.out.println(intBinaryOperator.applyAsInt(5,6));
//        String s = "20";
//        String sl = "19.9";
//
//        int num = s.compareTo(sl);
//        if (num > 0){
//            System.out.println("s大于sl");
//        }else if (num < 0){
//            System.out.println("s小于sl");
//        }else {
//            System.out.println("s等于sl");
//        }
//        String s = "17829076398";
//        String [] a = s.split(";");
//        List<String> l = new ArrayList();
//        for (int i=0;i<a.length;i++){
//            l.add(a[i]);
//        }
//        for (String ls:l){
//            System.out.println(ls);
//        }
//        String s = "2019-06-24 00:00:00 0000";
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
//        String rs = null;
//        try {
//            Date ss = df.parse(s);
//            Date sss = df.parse(df.format(new Date()));
//            if (ss.before(sss) || ss.equals(sss)){
//                System.out.println("执行任务");
//            }else {
//                rs = ">";
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println(rs);


//        String s = "url;lss;";
//        s = s.substring(0,s.length()-1);
//        String[] a = s.split(";");
//        String el="";
//        for (int i=0;i<a.length;i++){
//            el += "'"+a[i]+"'"+",";
//
//        }
//        el = el.substring(0,el.length()-1);
//        System.out.println(el);

//        Map<String,String> mp4 = new HashMap();
//        Map<String,String> m3u8 = new HashMap();
//        List<String> mp4List = new ArrayList<>();
//        try {
//            File file = new File("C:\\Users\\Administrator\\Desktop\\mmmm1.txt");
//            BufferedReader reader = new BufferedReader(new FileReader(file));
//            while(true) {
//                String line = reader.readLine();
//                if (line != null) {
//                    String videoName = line.substring(0, line.indexOf("/")).trim();
//                    String path = line.substring(line.indexOf("/") + 1);
//                    String[] paths = path.split("/");
//                    if (paths[4].endsWith("mp4")) {
//                        mp4.put(paths[4], videoName);
//                        mp4List.add(paths[4]);
//                    } else {
//                        m3u8.put(paths[3], videoName);
//                    }
//                } else {
//                    break;
//                }
//            }
//            File disk = new File("D:\\mp4");
//            List<String> list = new ArrayList<>();
//            File[] mp4Files = disk.listFiles();
//            for (File mp4File : mp4Files) {
//                String fileName = mp4File.getName();
//                String realFileName = mp4.get(fileName);
//                String path = mp4File.getPath().replaceAll(fileName, realFileName + ".mp4");
//                mp4File.renameTo(new File(path));
//                list.add(fileName);
//            }
//            for (String s : mp4List) {
//                if (!list.contains(s)) {
//                    System.out.println(s);
//                }
//            }
//            File disk1 = new File("D:\\hls");
//            File[] m3u8Files = disk1.listFiles();
//            for (File m3u8File : m3u8Files) {
//                String fileName = m3u8File.getName();
//                String realFileName = m3u8.get(fileName);
//                m3u8File.renameTo(new File(m3u8File.getPath() + realFileName));
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//        String s = "12567897654;18976580986";
//        String[] ss = s.split(";");
//        List l = new ArrayList();
//        for (String ls:ss){
//            l.add(ls);
//        }
//        System.out.println(l);
//    try {
//        File file = new File("C:\\Users\\Administrator\\Desktop\\new 2.txt");
//        BufferedReader reader = new BufferedReader(new FileReader(file));
//        int i = 0;
//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\mp4\\1.txt");
//        for ( ; ; ) {
//            String line = reader.readLine();
//            if (line != null) {
//
//                String s = "http://125.210.118.56" +  line +System.getProperty("line.separator");
//                byte[] bytes = s.getBytes();
//                i ++;
//                fileOutputStream.write(bytes);
//                if (i % 10 == 0) {
//                    fileOutputStream.close();
//                    fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\mp4\\" + (i / 10 + 1) + ".txt");
//                }
//            } else {
//                break;
//            }
//        }
//    }catch (Exception e){
//        e.printStackTrace();
//    }



//        RedisUtil redisUtil = new RedisUtil();
//        Jedis jedis = redisUtil.getJedis();
//        String s =jedis.get("quartzIp"); // 只能是字符串
//        System.out.println(s);
//        jedis.close();


//        InetAddress ia=null;
//        try {
//            ia=ia.getLocalHost();
//
//            String localname=ia.getHostName();
//            String localip=ia.getHostAddress();
//            System.out.println("本机名称是："+ localname);
//            System.out.println("本机的ip是 ："+localip);
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

//        String url = "E:\\logdata\\t1_detail.log";
//        String oldStr = "31/May/2019:16:01:03 +0800";
//        String newStr = "20190531160101";
//
//        File fs = new File(url);
//        String filename = fs.getName();
//        filename = filename.substring(0,filename.length()-4);
//        String p = fs.getParent();
//
//        File newF = new File(p+"\\"+"t1.log");
//        fs.renameTo(newF);

//        String l = oldStr.substring(oldStr.length()-5,oldStr.length());
//        if (l.equals("+0800")){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
//        System.out.println(l);
//        File file = new File(url);
//        Long fileLength = file.length();
//        byte[] fileContext = new byte[fileLength.intValue()];
//        FileInputStream in = null;
//        PrintWriter out = null;
//        try {
//            in = new FileInputStream(url);
//            in.read(fileContext);
//            // 避免出现中文乱码
//            String str = new String(fileContext, "utf-8");
//            //在这一步之前进行判断是否是需要替换的数据内容
//            str = str.replace(oldStr, newStr);
//            out = new PrintWriter(url);
//            out.write(str);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                out.flush();
//                out.close();
//                in.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


//        String s = "31/May/2019:16:01:01";
//        String ls = s.replace("/",":");
//        String demoArrays[] = ls.split(":");
//        List lss = Arrays.asList(demoArrays);
//        String y = lss.get(1).toString();
//        String rs = EunmUtil.valueOf(y).getNum();
//
//        String data = lss.get(2).toString() +
//                rs+
//                lss.get(0).toString()+
//                lss.get(3).toString()+
//                lss.get(4).toString()+
//                lss.get(5).toString();
//        System.out.println(data);
//        for(int i = 0; i < lss.size(); i++)
//        {
//            String ous = lss.get(i).toString();
//            System.out.println(ous);
//        }



    }
}
