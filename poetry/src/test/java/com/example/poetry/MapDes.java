package com.example.poetry;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/12/5
 * Time: 10:59
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MapDes {

    public static void main(String[] args){
        MapDes mapDes = new MapDes();
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        Map map3 = new HashMap();
        Map map4 = new HashMap();
        Map map5 = new HashMap();
        Map map6 = new HashMap();
        Map map7 = new HashMap();
        Map map8 = new HashMap();
        Map map9 = new HashMap();
        Map map10 = new HashMap();
        map1.put("id",1);
        map1.put("ability",7);
        map1.put("volume",3);
        map1.put("mastery",6);
        map1.put("activity",4);
        map1.put("attention",1);
        map1.put("corpId","test1");

        map2.put("id",2);
        map2.put("ability",3);
        map2.put("volume",3);
        map2.put("mastery",4);
        map2.put("activity",4);
        map2.put("attention",0);
        map2.put("corpId","test1");

        map3.put("id",3);
        map3.put("ability",6);
        map3.put("volume",2);
        map3.put("mastery",9);
        map3.put("activity",3);
        map3.put("attention",9);
        map3.put("corpId","test2");

        map4.put("id",4);
        map4.put("ability",5);
        map4.put("volume",6);
        map4.put("mastery",7);
        map4.put("activity",7);
        map4.put("attention",2);
        map4.put("corpId","test1");

        map5.put("id",5);
        map5.put("ability",10);
        map5.put("volume",8);
        map5.put("mastery",6);
        map5.put("activity",4);
        map5.put("attention",5);
        map5.put("corpId","test2");

        map6.put("id",6);
        map6.put("ability",13);
        map6.put("volume",4);
        map6.put("mastery",6);
        map6.put("activity",4);
        map6.put("attention",5);
        map6.put("corpId","test2");

        map7.put("id",7);
        map7.put("ability",12);
        map7.put("volume",13);
        map7.put("mastery",16);
        map7.put("activity",14);
        map7.put("attention",11);
        map7.put("corpId","test1");

        map8.put("id",8);
        map8.put("ability",9);
        map8.put("volume",15);
        map8.put("mastery",11);
        map8.put("activity",4);
        map8.put("attention",7);
        map8.put("corpId","test1");

        map9.put("id",9);
        map9.put("ability",6);
        map9.put("volume",9);
        map9.put("mastery",16);
        map9.put("activity",14);
        map9.put("attention",20);
        map9.put("corpId","test1");

        map10.put("id",10);
        map10.put("ability",9);
        map10.put("volume",9);
        map10.put("mastery",9);
        map10.put("activity",9);
        map10.put("attention",9);
        map10.put("corpId","test1");
        List lm = new ArrayList();
        lm.add(map1);
        lm.add(map2);
        lm.add(map3);
        lm.add(map4);
        lm.add(map5);
        lm.add(map6);
        lm.add(map7);
        lm.add(map8);
        lm.add(map9);
        lm.add(map10);
        Set<String> ss = new HashSet<>();
        for (int i=0;i<lm.size();i++){
            Map m =(Map) lm.get(i);
            String corpId = m.get("corpId").toString();
            ss.add(corpId);
        }
            for (String s:ss){
                List list = new ArrayList();
                for (int j=0;j<lm.size();j++){
                Map cmm = (Map) lm.get(j);
                if (s.equals(cmm.get("corpId"))){
                    list.add(cmm);
                }
            }
                mapDes.dtl(list);
        }
        for (int k=0;k<lm.size();k++){
            Map cmm = (Map) lm.get(k);
            System.out.println(cmm.get("id")+":"+cmm.get("totalScore")+"--"+cmm.get("top")+"==="+cmm.get("corpId"));
        }
    }

    public List<Map<String,Object>> dtl(List<Map<String,Object>> lm){
        int[] vDes =new int[lm.size()];
        for(int i=0;i<lm.size();i++){
            Map<String,Object> m = (Map<String,Object>)lm.get(i);
            //学习力
            int ability = Integer.valueOf(m.get("ability").toString());
            //学习量
            int volume = Integer.valueOf(m.get("volume").toString());
            //掌握度
            int mastery = Integer.valueOf(m.get("mastery").toString());
            //活跃度
            int activity = Integer.valueOf(m.get("activity").toString());
            //关注度
            int attention = Integer.valueOf(m.get("attention").toString());
            int totalScore = ability+volume+mastery+activity+attention;
            m.put("totalScore",totalScore);
            vDes[i] = totalScore;
        }
        Set<Integer> ls = new HashSet<>();
        for (int d:vDes){
            ls.add(d);
        }
        int[] il = new int[ls.size()];
        int index=0;
        for (int s:ls){
            il[index++]=s;
        }
        int[] dl = this.bubble(il);
        for (int j = 0;j<dl.length;j++){
            for(int i=0;i<lm.size();i++){
                Map<String,Object> m = (Map<String,Object>)lm.get(i);
                if (dl[j] == (Integer.valueOf(m.get("totalScore").toString()))){
                    m.put("top",lm.size()-j);
                }
            }
        }
        return lm;
    }
    public int[] bubble(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int k = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = k;
                }
            }
        }
        return a;
    }
}
