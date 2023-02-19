package com.leetcode.offer;

/**
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积, 即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 * @Author Liuyunda
 * @Date 2023/2/19 17:26
 */
public class Questions66 {
    public int[] constructArr(int[] a) {
        if (a == null || a.length ==0) {
            return new int[0];
        }
        int len = a.length;
        int[] res = new int[len];
        int[] resLeft = new int[len];
        resLeft[0] = 1;
        for (int i = 1; i < len; i++) {
            resLeft[i] = resLeft[i - 1] * a[i - 1];
        }
        int[] resRight = new int[len];
        resRight[len -1] = 1;
        for (int i = len -2; i >= 0; i--) {
            resRight[i] = resRight[i+1] * a[i+1];
        }
        for (int i = 0; i < len; i++) {
            res[i] = resLeft[i] * resRight[i];
        }
        return res;
    }
}
