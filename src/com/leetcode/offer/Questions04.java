package com.leetcode.offer;

/**
 * @Author Liuyunda
 * @Date 2023/2/1 20:39
 */
public class Questions04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int x = matrix.length - 1, y = 0;
        while (x >= 0 && y < matrix[0].length) {
            if (matrix[x][y] > target) {
                x--;
            }else if (matrix[x][y] < target) {
                y++;
            }else {
                return true;
            }
        }
        return false;
    }
}
