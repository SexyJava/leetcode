package com.leetcode.offer;

import java.util.HashMap;

/**
 * @Author Liuyunda
 * @Date 2023/2/16 20:51
 */
public class Questions07 {
    int [] preOrder;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length -1);
    }

    TreeNode recur(int root, int left, int right){
        if (left > right) return null;
        TreeNode treeNode = new TreeNode(preOrder[root]);
        int curr = map.get(preOrder[root]);
        treeNode.left = recur(root + 1, left, curr -1);
        treeNode.right = recur(root + (curr - left) + 1,curr + 1, right);
        return treeNode;
    }
}
