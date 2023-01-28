package com.leetcode.offer;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * @Author Liuyunda
 * @Date 2023/1/28 23:37
 */
public class Questions30 {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-10);
        obj.push(3);
        obj.pop();
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.min();
    }
}
class MinStack {

    private Long min;

    private Stack<Long> stack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(0l);
            min = Long.valueOf(x);
        }else {
            stack.push(x - min);
            min = Math.min(x, min);
        }


    }

    public void pop() {
        if (stack.peek() < 0) {
            min = min - stack.pop();
            return;
        }
        stack.pop();
    }

    public int top() {
        if (stack.peek() > 0) {
            return (int) (min + stack.peek());
        } else {
            return Math.toIntExact(min);
        }
    }

    public int min() {
        return Math.toIntExact(min);
    }
}
