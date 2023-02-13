package com.leetcode.offer;

import java.util.Arrays;

/**
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * @Author Liuyunda
 * @Date 2023/2/13 21:19
 */
public class Questions40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        quicksort(arr, 0, arr.length - 1);
        return Arrays.copyOf(arr, k);
    }
    void quicksort(int[] arr, int left, int right){
        if (left >= right) return;
        int i = left, j = right;
        while (i< j) {
            while (i< j && arr[j] >= arr[left]) j--;
            while (i<j && arr[i] <= arr[left]) i ++;
            swap(arr, i, j);
        }
        swap(arr, i, left);
        quicksort(arr, left, i -1);
        quicksort(arr, i + 1, right);
    }
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
