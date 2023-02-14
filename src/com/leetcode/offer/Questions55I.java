package com.leetcode.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 输入一棵二叉树的根节点，求该树的深度。
 * 从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 * @Author Liuyunda
 * @Date 2023/2/14 20:17
 */
public class Questions55I {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    public int maxDepth1(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int n = 0;
        while (!queue.isEmpty()) {
            n ++ ;
            int x = queue.size();
            for (int i = 0; i < x; i++) {
                TreeNode poll = queue.poll();
                if (poll.left != null) queue.add(poll.left);
                if (poll.right != null) queue.add(poll.right);
            }
        }
        return n;
    }
}
