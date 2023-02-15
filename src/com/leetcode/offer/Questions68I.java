package com.leetcode.offer;

/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * @Author Liuyunda
 * @Date 2023/2/15 20:30
 */
public class Questions68I {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root !=null) {
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            }else if (root.val < p.val && root.val < q.val) {
                root = root.right;
            }else break;
        }
        return root;
    }
}
