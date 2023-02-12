package com.leetcode.offer;

import java.util.HashSet;

/**
 * 从若干副扑克牌中随机抽 5 张牌，
 * 判断是不是一个顺子，
 * 即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 * @Author Liuyunda
 * @Date 2023/2/12 20:35
 */
public class Questions61 {
    public boolean isStraight(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0, min = 14;
        for (int num : nums) {
            if (num == 0) continue;
            max = Math.max(num,max);
            min = Math.min(num,min);
            if (set.contains(num)) return false;
            set.add(num);
        }
        return max -min < 5;
    }
}
