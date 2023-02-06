package com.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 * @Author Liuyunda
 * @Date 2023/2/6 20:59
 */
public class Questions48 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int x = -1, res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                x = Math.max(x, map.get(s.charAt(i)));
            }
            map.put(s.charAt(i),i);
            res = Math.max(res, i - x);
        }
        return res;
    }
}
