package com.yang.dataStructure;

class Solution {
    public int reverse(int x) {

        boolean c = x >= 0 ? true : false;
        //记录下来x的正负，并把x转为正数
        if(!c) {
            x *= -1;
        }
        String s = Integer.toString(x);
        int res = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            res += (s.charAt(i) - '0') * Math.pow(10, i);
            if(res >= Integer.MAX_VALUE){
                return 0;
            }
        }
        if(c) {
            return res;
        } else {
            return res * -1;
        }
    }
}
public class MyTest {

    public static void main(String[] args) {

        System.out.println(new Solution().reverse(1534236469));
    }
}
