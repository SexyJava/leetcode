package com.leetcode.offer;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"
 * @Author Liuyunda
 * @Date 2023/1/30 20:53
 */
public class Questions05 {
    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                builder.append("%20");
            }else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
