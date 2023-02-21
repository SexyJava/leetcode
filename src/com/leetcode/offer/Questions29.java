package com.leetcode.offer;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * @Author Liuyunda
 * @Date 2023/2/21 20:29
 */
public class Questions29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1, x = 0;
        int [] res = new int[(right + 1) * (bottom + 1)];
        while (true) {
            for (int i = left; i <= right; i++) {
                res[x++] = matrix[top][i];
            }
            if (++top > bottom) break;
            for (int i = top; i <= bottom; i++) {
                res[x++] = matrix[i][right];
            }
            if (--right < left) break;
            for (int i = right; i >= left; i--) {
                res[x++] = matrix[bottom][i];
            }
            if (--bottom < top) break;
            for (int i = bottom; i >= top ; i--) {
                res[x++] = matrix[i][left];
            }
            if (++left > right) break;
        }
        return res;
    }
}
