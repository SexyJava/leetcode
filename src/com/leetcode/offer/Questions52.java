package com.leetcode.offer;

/**
 * @Author Liuyunda
 * @Date 2023/2/8 20:52
 */
public class Questions52 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (a != b) {
            a = a!=null?a.next:headB;
            b = b!=null?b.next:headA;
        }
        return b;
    }

}
