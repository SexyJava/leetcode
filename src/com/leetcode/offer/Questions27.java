package com.leetcode.offer;

/**
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * @Author Liuyunda
 * @Date 2023/2/3 20:32
 */
public class Questions27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }
}
