package com.example.poetry.lru;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: EMP </p>
 * Description: <br>
 * Copyright: CorpRights terminus.io<br>
 * Company: terminus.io<br>
 *
 * @author wang.tao
 * @version 1.0-SNAPSHOT
 * @date 2021-08-24
 * Least Recently Used 最近最少使用
 *
 * 我们用到的数据结构是：hashmap+双向链表
 */
public class LRUCache {

    //hashMap
    Map<Integer,Node> map;
    // 双向链表
    DoubleList cache;
    // 缓存的大小
    int tip;

    // 构造方法
    public LRUCache(int tip){
        map = new HashMap<>();
        cache = new DoubleList();
        this.tip = tip;
    }

    public DoubleList getCache(){
        return cache;
    }
    /**
     * 获取双向链表的value
     * @param key
     * @return
     */
    public int get(int key){
        Node node = map.get(key);
        return node == null?-1:node.value;
    }
    /**
     * 双向链表put值
     */
    public void put(int key ,int value){
        Node node = new Node(key,value);
        if (map.get(key) != null){
            // 当前值已存在于当前链表 则先做原始数据的删除，在做新数据头节点入队列
            cache.remove(node);
            cache.addFirst(node);
            map.put(key,node);
            return;
        }
        // 直接插入
        map.put(key,node);
        cache.addFirst(node);
        if (cache.size > tip){
            // 超出所允许的最大队列长度，移除最后一个节点
            cache.remove();
        }
    }
    /**
     * 节点内部类
     */
    class Node{
        public int key;
        public int value;
        public Node next;
        public Node pre;

        public Node(){};
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }

    /**
     * 双向链表
     */
    class DoubleList{
        private int size; // 链表长度
        private Node head; // 头节点
        private Node tail; // 尾节点

        public DoubleList(){
            this.head = new Node();
            this.tail = new Node();
            size = 0;
            head.next = tail;
            tail.pre = head;
        }

        /**
         * 头插法插入节点
         */
        public void addFirst(Node node){
            // 头节点后加新node
            Node temp = head.next;
            head.next = node;
            node.pre = head;
            node.next = temp;
            temp.pre = node;
            // 链表长度累加
            size++;
        }

        /**
         * 删除特定节点
         */
        public void remove(Node node){
            if (null == node || node.pre == null || node.next == null){
                return;
            }
            node.pre.next = node.next;
            node.next.pre = node.pre;
            node.pre = null;
            node.next = null;
            size--;
        }

        /**
         * 删除最后一个节点
         */
        public void remove(){
            if (size<=0) return;
            Node temp = tail.pre;
            temp.pre.next = temp.next;
            tail.pre = temp.pre;
            temp.next = null;
            temp.pre = null;
            size--;
        }
        /**
         * 获取链表长度
         */
        public int getSize(){
            return size;
        }
    }

    public static void main(String[] args) {
        LRUCache ext = new LRUCache(3);
        ext.put(1,1);
        ext.put(2,2);
        ext.put(3,3);
        ext.put(4,4);
        ext.put(5,5);
        DoubleList cache = ext.getCache();
        System.out.println(cache);
    }

}
