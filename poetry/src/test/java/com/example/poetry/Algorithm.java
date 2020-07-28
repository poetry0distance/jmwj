package com.example.poetry;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/11/19
 * Time: 9:48
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Algorithm {

    public static void main(String[] args) {
        int[] a = {3, 28, 16, 36, 5, 44, 27, 2, 46, 19, 50, 38, 4, 12, 56, 43};
        Algorithm al = new Algorithm();
        for (int i = 0;i<al.pick(a).length;i++){
            System.out.println(al.pick(a)[i]);
        }
    }

    // 冒泡排序
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

    // 选择排序
    public int[] pick(int[] a){
        int minIndex,k;
        for (int i=0;i<a.length-1;i++){
            minIndex = i;
            for (int j = i+1;j<a.length;j++){
                if (a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            k = a[i];
            a[i] = a[minIndex];
            a[minIndex] = k;
        }
        return a;
    }
    // 插入排序
    public int[] insert(int[] a){
        int preIndex,k;
        for (int i = 1; i < a.length; i++) {
            preIndex = i - 1;
            k = a[i];
            while (preIndex >= 0 && a[preIndex] > k) {
                a[preIndex + 1] = a[preIndex];
                preIndex--;
            }
            a[preIndex + 1] = k;
        }
        return a;
    }

    //希尔排序
    public int[] shell(int[] a){
        int len = a.length;
        for (int gap = (int) Math.floor(len / 2) ; gap > 0; gap = (int)Math.floor(gap / 2)) {
            for (int i = gap; i < len; i++) {
                int j = i;
                int current = a[i];
                while (j - gap >= 0 && current < a[j - gap]) {
                    a[j] = a[j - gap];
                    j = j - gap;
                }
                a[j] = current;
            }
        }
        return a;
    }
}