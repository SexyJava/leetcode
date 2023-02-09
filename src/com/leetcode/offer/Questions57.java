package com.leetcode.offer;

import java.util.HashMap;

/**
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可
 * @Author Liuyunda
 * @Date 2023/2/9 21:43
 */
public class Questions57 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int s = nums[left] + nums[right];
            if (s > target) {
                right --;
            }else if (s < target) {
                left ++;
            }else {
                return new int[]{nums[left] , nums[right]};
            }
        }
        return null;
    }

    /**
     * 如果 nums 无序
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {nums[i], nums[map.get(target - nums[i])]};
            }
            map.put(nums[i], i);

        }
        return null;
    }
}
