package com.yang.dataStructure;
import org.junit.experimental.max.MaxCore;
import sun.reflect.generics.tree.Tree;

import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {

        int ans = 0;
        int n = prices.length;

        for(int i = 1; i < n; i++) {
            if(prices[i] - prices[i - 1] > 0) {
                ans += prices[i] - prices[i - 1];
            }
        }
        return ans;

    }
}

public class MyTest {

    public static void main(String[] args) {

        System.out.println(new Solution().maxProfit(new int[]{1,2,3,4,5}));


    }
}
