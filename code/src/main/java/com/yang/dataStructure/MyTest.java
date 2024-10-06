package com.yang.dataStructure;
import org.junit.experimental.max.MaxCore;
import sun.reflect.generics.tree.Tree;

import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        if(n == 0 || n == 1) {
            return ans;
        }

        if(prices[1] > prices[0]) {
            ans -= prices[0];
        }

        for(int i = 1; i < n - 1; i++) {

            //假如当天的价格是 前一天、当天、后一天 价格中最低的，可以买入
            if(prices[i] <= prices[i - 1] && prices[i] <= prices[i + 1]) {
                ans -= prices[i];
            }

            //假如当天的价格是 前一天、当天、后一天 价格中最高的，可以卖出
            if(prices[i] >= prices[i - 1]) {
                ans += prices[i];
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
