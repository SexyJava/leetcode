package com.leetcode.offer;

/**
 * 给定一棵二叉搜索树，请找出其中第 k 大的节点的值。
 * @Author Liuyunda
 * @Date 2023/2/11 19:32
 */
public class Questions54 {
    int res, k ;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    public  void dfs (TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        if (k == 0) {
            return;
        }
        if (--k == 0) this.res = root.val;
        dfs(root.left);
    }
}
