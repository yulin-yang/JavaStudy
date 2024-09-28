package com.itheima.algorithm.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestE01Leetcode1122 {

    private E01Leetcode1122 leetcode = new E01Leetcode1122();

    @Test
    public void test1() {
        int[] arr1 = {28, 6, 22, 8, 44, 17};
        int[] arr2 = {22, 28, 8, 6};
        int[] result = {22, 28, 8, 6, 17, 44};
        assertArrayEquals(result, leetcode.relativeSortArray(arr1, arr2));
    }

    @Test
    public void test2() {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] result = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        assertArrayEquals(result, leetcode.relativeSortArray(arr1, arr2));
    }
}
