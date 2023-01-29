package com.leetcode.offer;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点
 * @Author Liuyunda
 * @Date 2023/1/29 21:00
 */
public class Questions24 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next=listNode3;
        reverseList(listNode);
    }
    public static ListNode reverseList(ListNode head) {
        ListNode current = head, pre = null;
        while(current != null) {
            ListNode tmp = current.next; // 暂存后继节点 cur.next
            current.next = pre;          // 修改 next 引用指向
            pre = current;               // pre 暂存 cur
            current = tmp;               // cur 访问下一节点
        }
        return pre;
    }
}