package com.itheima.algorithm.sort;

import java.util.Arrays;

/**
 * <h3>归并排序 TopDown</h3>
 */
public class MergeSortTopDown {

    /*
        a1 原始数组
        i~iEnd 第一个有序范围
        j~jEnd 第二个有序范围
        a2 临时数组
     */
    public static void merge(int[] a1, int i, int iEnd, int j, int jEnd, int[] a2) {
        int k = i;
        while (i <= iEnd && j <= jEnd) {
            if (a1[i] < a1[j]) {
                a2[k] = a1[i];
                i++;
            } else {
                a2[k] = a1[j];
                j++;
            }
            k++;
        }
        if (i > iEnd) {
            System.arraycopy(a1, j, a2, k, jEnd - j + 1);
        }
        if (j > jEnd) {
            System.arraycopy(a1, i, a2, k, iEnd - i + 1);
        }
    }

    public static void sort(int[] a1) {
        int[] a2 = new int[a1.length];
        split(a1, 0, a1.length - 1, a2);
    }

    private static void split(int[] a1, int left, int right, int[] a2) {
//        int[] array = Arrays.copyOfRange(a1, left, right + 1);
//        System.out.println(Arrays.toString(array));

        // 2. 治
        if (left == right) {
            return;
        }
        // 1. 分
        int m = (left + right) >>> 1;
        split(a1, left, m, a2);                 // left = 0 m = 0  9
        split(a1, m + 1, right, a2);       // m+1 = 1 right = 1  3
        // 3. 合
        merge(a1, left, m, m + 1, right, a2);
        System.arraycopy(a2, left, a1, left, right - left + 1);
        System.out.println(left + " " + right);
    }

    public static void main(String[] args) {
        int[] a = {9, 3, 7, 2, 8, 5, 1, 4};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
