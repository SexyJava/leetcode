package com.leetcode.offer;

/**
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * @Author Liuyunda
 * @Date 2023/2/15 20:42
 */
public class Questions68II {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        }else if (right == null) {
            return left;
        }else return root;
    }
}
