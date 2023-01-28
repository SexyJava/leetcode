package com.leetcode.offer;

import java.util.LinkedList;

/**
 * 用两个栈实现一个队列。
 * 队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * @Author Liuyunda
 * @Date 2023/1/28 22:57
 */
public class Questions09 {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(100);
        cQueue.appendTail(100);
        cQueue.appendTail(100);
        cQueue.appendTail(100);
        cQueue.deleteHead();
        cQueue.deleteHead();
        cQueue.deleteHead();
        cQueue.deleteHead();
        cQueue.deleteHead();
        cQueue.deleteHead();

    }
}
class CQueue {


    private LinkedList<Integer> inStack;
    private LinkedList<Integer> outStack;
    public CQueue() {
        this.inStack = new LinkedList<>();
        this.outStack = new LinkedList<>();
    }

    public void appendTail(int value) {
        inStack.add(value);
    }

    public int deleteHead() {
        if (outStack.isEmpty()) {
            if (inStack.isEmpty()) {
                return -1;
            }
            transfer();
        }
        return outStack.removeLast();
    }

    public void transfer() {
        while (!inStack.isEmpty()) {
            outStack.add(inStack.removeLast());
        }
    }

}