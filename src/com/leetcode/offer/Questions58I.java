package com.leetcode.offer;

/**
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 * @Author Liuyunda
 * @Date 2023/2/9 22:17
 */
public class Questions58I {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder builder = new StringBuilder();
        int left = s.length() - 1, right = left;
        while (left >= 0) {
            while (left >= 0 && s.charAt(left) != ' ') left --;
            builder.append(s.substring(left + 1, right + 1) + ' ');
            while (left >= 0 && s.charAt(left) == ' ') left --;
            right = left;
        }
        return builder.toString().trim();
    }
}
