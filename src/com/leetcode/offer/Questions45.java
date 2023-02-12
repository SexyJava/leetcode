package com.leetcode.offer;

import java.util.Arrays;

/**
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * @Author Liuyunda
 * @Date 2023/2/12 20:24
 */
public class Questions45 {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y+x));
        StringBuilder builder = new StringBuilder();
        for(String s : strs) {
            builder.append(s);
        }
        return builder.toString();
    }


}
