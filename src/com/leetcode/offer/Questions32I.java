package com.leetcode.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 *
 * @Author Liuyunda
 * @Date 2023/2/2 21:36
 */
public class Questions32I {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> array = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            array.add(node.val);
            if (node.left!=null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        int[] ints = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            ints[i] = array.get(i);
        }
        return ints;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}