package com.leetcode.offer;

/**
 * 在一个 m*n 的棋盘的每一格都放有一个礼物，
 * 每个礼物都有一定的价值（价值大于 0）。
 * 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。
 * 给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
 * @Author Liuyunda
 * @Date 2023/2/5 23:32
 */
public class Questions47 {
    public int maxValue(int[][] grid) {
        int y = grid.length, x = grid[0].length;
        for (int i = 1; i < y; i++) {
            grid[i][0] += grid[i-1][0];
        }
        for (int j = 1; j < x; j++) {
            grid[0][j] += grid[0][j-1];
        }
        for (int i = 1; i < y; i++) {
            for (int j = 1; j < x; j++) {
                grid[i][j] += Math.max(grid[i][j-1],grid[i-1][j]);
            }
        }
        return grid[y-1][x-1];
    }
}
