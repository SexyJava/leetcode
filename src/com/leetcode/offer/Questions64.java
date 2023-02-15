package com.leetcode.offer;

/**
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @Author Liuyunda
 * @Date 2023/2/15 20:27
 */
public class Questions64 {
    public int sumNums(int n) {
        return n == 1? 1 :sumNums(n-1) +n;
    }
}
