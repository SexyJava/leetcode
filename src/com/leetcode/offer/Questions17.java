package com.leetcode.offer;

/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * @Author Liuyunda
 * @Date 2023/2/26 18:02
 */
public class Questions17 {
    int[] res;
    int cnt = 0;
    char[] num, NUM = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    void dfs(int x, int len) {
        if (x == len) {
            res[cnt++] = Integer.parseInt(String.valueOf(num).substring(0, len));
            return ;
        }
        int start = x == 0 ? 1 : 0;
        for (int i = start; i <= 9; ++ i) {
            num[x] = NUM[i];
            dfs(x + 1, len);
        }
    }
    public int[] printNumbers(int n) {
        res = new int[(int)Math.pow(10, n) - 1];
        num = new char[n];
        for (int i = 1; i <= n; ++ i) dfs(0, i);
        return res;
    }
}
