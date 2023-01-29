package com.leetcode.offer;

import java.util.LinkedList;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
 * @Author Liuyunda
 * @Date 2023/1/29 20:42
 */
public class Questions06 {
    public static void main(String[] args) {

    }
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<>();
        while (head != null) {
            stack.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.removeLast();
        }
        return res;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}