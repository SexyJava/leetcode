package com.leetcode.offer;

/**
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 * @Author Liuyunda
 * @Date 2023/1/31 21:11
 */
public class Questions53II {
    public static void main(String[] args) {
        int[] x = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(missingNumber(x));
    }
    public static int missingNumber(int[] nums) {
        int left = 0, right = nums.length -1;
        while (left<=right) {
            int mid = (left + right)/2;
            if (nums[mid] == mid) {
                left =  mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }
}
