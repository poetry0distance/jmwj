package com.example.poetry.ola;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2018/12/19
 * @author false
 * Description:
 */
public class Algorithm {

    /**冒泡
     * BubbleSort
     * @param args
     * [2,5,8,1,3,7]
     */
    public int[] bubbleSort(int[] args){
        for (int i =0;i<args.length-1;i++){

            for (int j=0;j<args.length-1-i;j++){

                if (args[j]>args[j+1]){

                    int s = args[j+1];
                    args[j+1] = args[j];
                    args[j] = s;
                }
            }
        }
        return args;
    }

    /**
     * 冒泡改进(节约时间);有问题
     * @param args
     * @return
     */
    public int[] newBubbleSort(int[] args){
        int i = args.length -1;
        while (i>0){
            int pos = 0;
            for (int j=0;j<i;j++){
                if (args[j]>args[j+1]){
                    pos = j;
                    int temp = args[j];
                    args[j] =args[j+1];
                    args[j+1]=temp;
                }
                i=pos;
            }
        }
        return args;
    }

    /**选择
     * selectSort
     * @param args
     * @return [2,5,8,1,3,7]
     */
    public int[] selectSort(int [] args){
        int temp,minIndex;
        for (int i =0;i<args.length;i++){
            minIndex =i;
            for (int j=i+1;j<args.length;j++){
                if (args[j]<args[minIndex]){
                    minIndex =j;
                }
            }
            temp =args[i];
            args[i]=args[minIndex];
            args[minIndex]=temp;
        }
        return args;
    }

    /**插入
     * insertSort
     * @param args
     * @return [2,5,8,1,3,7]
     */
    public int[] insertSort(int[] args){
        //外层向右的index，即作为比较对象的数据的index
        for(int index = 1; index<args.length; index++){
            //用作比较的数据
            int temp = args[index];
            int leftindex = index-1;
            //当比到最左边或者遇到比temp小的数据时，结束循环
            while(leftindex>=0 && args[leftindex]>temp){
                args[leftindex+1] = args[leftindex];
                leftindex--;
            }
            //把temp放到空位上
            args[leftindex+1] = temp;
        }
        return args;
    }

    /**
     * 希尔排序
     * @param agrs
     * @return
     */
    public int[] shellSort(int[] agrs){
        int n = agrs.length;
        int gap = n/2;
        while(gap > 0){
            for(int j = gap; j < n; j++){
                int i=j;
                while(i >= gap && agrs[i-gap] > agrs[i]){
                    int temp = agrs[i-gap]+agrs[i];
                    agrs[i-gap] = temp-agrs[i-gap];
                    agrs[i] = temp-agrs[i-gap];
                    i -= gap;
                }
            }
            gap = gap/2;
        }
        return agrs;
    }

    /**
     * 归并排序
     * @param
     * @return
     */
    public int[] sort(int[] array, int start, int end) {
        if (start >= end)
            return null;
        int mid = (start + end) >> 1;
        // 递归实现归并排序
        sort(array, start, mid);
        sort(array, mid + 1, end);
        return  mergerSort(array, start, mid, end);
    }
    public int[] mergerSort(int[] agrs,int start,int mid,int end){
        int[] arr = new int[end +1];
        int low = start;
        int left = start;
        int center = mid +1;
        while (start <=mid && center<=end){
            arr[low++] = agrs[start] > agrs[center] ? agrs[center++] : agrs[start++];
        }
        // 若还有段序列不为空，则将其加入临时数组末尾
        while (start <= mid) {
            arr[low++] = agrs[start++];
        }
        while (center <= end) {
            arr[low++] = agrs[center++];
        }
        // 将临时数组中的值copy到原数组中
        for (int i = left; i <= end; i++) {
            agrs[i] = arr[i];
        }
        return agrs;
    }

    /**
     * 快速排序
     * @param args
     * @return
     */
    public int[] rapidSort(int[] args,int low ,int high){

        int start =low;
        int end = high;
        //起始值
        int key = args[low];

        while (end > start){
            while (end>start && args[end]>=key) {
                end--;
                if (args[end] <= key) {
                    int temp = args[end];
                    args[end] = args[start];
                    args[start] = temp;
                }
            }
                while (end>start && args[start] <= key){
                    start++;
                    if (args[start] >= key){
                        int temp = args[start];
                        args[start] = args[end];
                        args[end] =temp;
                    }
                }
            //左边序列。第一个索引位置到关键值索引-1
            if(start>low) {
                sort(args,low,start-1);
            }
            //右边序列。从关键值索引+1到最后一个
            if(end<high) {
                sort(args,end+1,high);
            }
        }
        return args;
    }


    private int[] quicksort(int[] array,int begin,int end){
        if(begin<end){
            //i和j没相遇之前比较各数据与基准值大小
            //取第一个值为基准值
            int base = array[begin];
            //左标记为i
            int i = begin;
            //右标记为j
            int j = end;

            //一趟排序，找到比基准值大的在基准值右，比基准值小的在基准值左
            while(i<j){
                //从右往左扫描
                //从右往左扫，如果元素比基准值大
                while(i<j && array[j]>base){
                    j--;  //则右边标记--，直到找到第一个比基准值小的，停止扫描
                }
                if(i<j){
                    //交换右扫描第一个比基准值小的数
                    array[i]=array[j];
                    i++;  //i标记右移一位
                }
                //从左往右扫描
                while(i<j && array[i]<base){
                    //从左往右扫，如果元素比基准值小
                    //则左标记++，直到找到第一个比基准值大的，停止扫描
                    i++;
                }
                if(i<j){
                    //交换左扫描第一个比基准值大的数
                    array[j]=array[i];
                    j--;  //j标记左移一位
                }
            }  //此时基准值左右两侧相对有序

            //此时i为中间位置k
            array[i] = base;

            //左侧按照快排思路，递归
            quicksort(array,begin,i-1);

            //右侧按照快排思路，递归
            quicksort(array,i+1,end);
        }
        return array;
    }
    public static void main(String[] args){
        int[] a= {2,5,8,6,7,1,3,9};
        Algorithm al = new Algorithm();
        int[] b = al.quicksort(a,0,7);
        for (int i:b) {
            System.out.println(i);
        }
    }
}
