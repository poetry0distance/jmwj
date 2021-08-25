package com.example.poetry.lru.okl;

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
 * @date 2021-08-25
 * 屏蔽jdk的linkHashMap，手写lru算法，借鉴linkHashMap思想
 * hash+双向链表
 * hash 便于快速查找
 * 双向链表用于数据存储
 */
public class LRUDisNoLink {

    private int capacity;
    // 自定义map 存储key 和数据
    Map<Integer,Node<Integer,Integer>> map;
    // 自定义双向链表，存储数据
    DoubleLink<Integer,Integer> link;

    public LRUDisNoLink(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        link = new DoubleLink<>();
    }
    /**
     *  get方法
     * @param key
     * @return
     */
    public Integer get(Integer key){
        if (!map.containsKey(key)){
            return -1;
        }
        Node<Integer, Integer> node = map.get(key);
        // 将当前节点 放置于头节点
        link.remove(node);
        link.addHead(node);
        return node.value;
    }

    /**
     * put方法
     * @param key
     * @param value
     */
    public void put(Integer key,Integer value){

        if (map.containsKey(key)){
            // 当前的key内容已存在 --做更新操作
            Node<Integer, Integer> node = map.get(key);
            map.put(key,node);
            link.remove(node);
            node.value = value;
            link.addHead(node);
        }else {
            if (map.size() >= capacity){
                //当前缓存已经满了
                Node<Integer, Integer> lastNode = link.getLastNode();
                map.remove(lastNode.key);
                link.remove(lastNode);
            }
            Node<Integer, Integer> node = new Node<>(key, value);
            map.put(key,node);
            link.addHead(node);
        }
    }

    // 数据存放基于Node数据结构 --参照linkHashMap
    class Node<K,V>{
        K key;
        V value;
        Node<K,V> next; // 后节点指针 重要
        Node<K,V> pre; // 前节点指针 重要

        // 无参构造方法
        public Node(){
            this.next = this.pre = null;
        }
        // 有参构造方法
        public Node(K key,V value){
            this.key = key;
            this.value = value;
            this.next = this.pre = null;
        }
    }

    class DoubleLink<K,V>{
        Node<K,V> head; // 头节点
        Node<K,V> tail; // 尾节点

        public DoubleLink(){
            head = new Node<>();
            tail = new Node<>();
            head.next = tail;
            tail.pre = head;
        }

        /**
         * 链表添加头节点
         * 基于head做数据处理
         * @param node
         */
        public void addHead(Node<K,V> node){
            node.next = head.next;
            node.pre = head;
            head.next.pre = node;
            head.next = node;
        }

        /**
         * 移除节点
         * @param node
         */
        public void remove(Node<K,V> node){
            node.next.pre = node.pre;
            node.pre.next = node.next;
            node.next = null;
            node.pre = null;
        }

        public Node<K,V> getLastNode(){
            return tail.pre;
        }
    }

    public static void main(String[] args) {
        LRUDisNoLink lruDisNoLink = new LRUDisNoLink(3);
        lruDisNoLink.put(1,1);
        lruDisNoLink.put(2,2);
        lruDisNoLink.put(3,3);
        System.out.println(lruDisNoLink.map.keySet());
        lruDisNoLink.put(4,4);
        System.out.println(lruDisNoLink.map.keySet());
        lruDisNoLink.put(1,1);
        System.out.println(lruDisNoLink.map.keySet());
    }
}