package com.leetcode.offer;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 * @Author Liuyunda
 * @Date 2023/2/16 21:43
 */
public class Questions33 {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length - 1);
    }
    boolean recur(int[] tree, int i, int j) {
        if (i >= j) return true;
        int x = i;
        while (tree[x] < tree[j]) x ++;
        int m = x;
        while (tree[x] > tree[j]) x ++;
        return x == j && recur(tree, i, m-1) && recur(tree, m,j-1);
    }
}
