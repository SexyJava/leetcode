package com.leetcode.offer;

/**
 * 统计一个数字在排序数组中出现的次数
 * @Author Liuyunda
 * @Date 2023/1/31 20:51
 */
public class Questions53I {

    public static void main(String[] args) {
        int[] x = new int[]{5,7,7,8,8,10};
        System.out.println(search(x,8));
    }
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while (left<=right) {
            int mid = left + (right -left)/2;
            if (nums[mid] < target) {
                left = mid + 1;
            }else if (nums[mid] > target) {
                right = mid - 1;
            }else {
                if (nums[left] == nums[right]) {
                    return right - left + 1;
                }
                if (nums[left] < target) {
                    left ++;
                }
                if (nums[right] > target) {
                    right --;
                }
            }
        }
        return 0;
    }
}
