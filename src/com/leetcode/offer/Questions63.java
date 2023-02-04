package com.leetcode.offer;

/**
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 * @Author Liuyunda
 * @Date 2023/2/4 19:19
 */
public class Questions63 {
    public int maxProfit(int[] prices) {
        // 转移方程 lirun = max(lirun, prices[i] - min(cost, prices[i]))
        int cost = Integer.MAX_VALUE, lirun = 0;
        for (int price : prices) {
            cost = Math.min(cost, price);
            lirun = Math.max(lirun, price - cost);
        }
        return lirun;
    }
}
