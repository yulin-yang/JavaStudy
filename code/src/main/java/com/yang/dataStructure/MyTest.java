package com.yang.dataStructure;

import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int len = height.length;
        if(len < 2) {
            return res;
        }

        for(int l = 0, r = len - 1; l < r;) {
            int area = (r - l) * Math.min(height[l], height[r]);
            res = area > res ? area : res;
            if(height[l] < height[r]) {
                l++;
            }else {
                r--;
            }
        }
        return res;
    }
}
public class MyTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Collections.reverse(list);
        for (Integer i : list) {
            System.out.println(i);
        }


    }
}
