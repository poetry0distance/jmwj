package com.example.poetry.leetcode;

/**
 * User: wasu
 * Date: 2020/7/3
 *
 * @author false
 * Description: 数组下标
 */
public class OlaSysArraySub {

    OlaSysArraySub(){}
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];

        for (int i =0;i<nums.length;i++){
            int j = nums[i];
            int k = target - j;
            for (int z=i+1;z<nums.length;z++){
                if (k == nums[z]){
                    a[0] = i;
                    a[1] = z;
                    break;
                }
            }
        }
        if (a[0] == a[1]){
            System.out.println("There is no implementation combination");
        }
        return a;
    }
    public static void main(String[] agrs){
        OlaSysArraySub o = new OlaSysArraySub();
        int[] nums = {2,7,11,15};
        int num = 26;
        int[] n = o.twoSum(nums,num);
        System.out.println(n[0]+" -- "+n[1]);
    }
}
