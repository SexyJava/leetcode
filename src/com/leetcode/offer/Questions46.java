package com.leetcode.offer;

/**
 * 给定一个数字，我们按照如下规则把它翻译为字符串：
 * 0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * @Author Liuyunda
 * @Date 2023/2/6 20:28
 */
public class Questions46 {
    public int translateNum(int num) {
        String temp = String.valueOf(num);
        int a = 1,b=1;
        for (int i = 2; i <= temp.length(); i++) {
            String s = temp.substring(i - 2, i);
            int c = s.compareTo("10") >= 0 && s.compareTo("25") <=0 ? a + b: a;
            b = a;
            a = c;
        }
        return a;
    }
}
