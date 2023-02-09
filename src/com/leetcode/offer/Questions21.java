package com.leetcode.offer;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 *
 * @Author Liuyunda
 * @Date 2023/2/9 21:28
 */
public class Questions21 {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1, temp;
        while (left < right) {
            while (left < right && (nums[left] & 1) == 1) {
                left ++;
            }
            while (left <right && (nums[right] & 1) == 0) {
                right --;
            }
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}
