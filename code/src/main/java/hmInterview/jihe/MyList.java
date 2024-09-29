package hmInterview.jihe;


import java.util.*;

class Solution {

    //自己写一个翻转方法，来翻转 c 数组从起始位置 start 到终止位置 end的元素
    public void reverSubStr(char[] c, int start, int end) {

        char tmp;
        while(start < end) {
            tmp = c[start];
            c[start] = c[end];
            c[end] = tmp;
            start++;
            end--;
        }
    }

    public String reverseStr(String s, int k) {

        char[] c = s.toCharArray();
        char tmp;

        for(int i = 0; i < c.length; i += 2 * k){

            int start = i;
            //判断从当前位置开始往后的字符还有没有k个
            //如果有的话，翻转尾指针就指向 start + k
            //如果不够的话，就指向数组最后一个元素
            int end = Math.min(start + k, c.length - 1);

            //开始翻转
            reverSubStr(c, start, end);
        }

        return new String(c);
    }
}


public class MyList {

    public static void main(String args[]) {

        char[] c = "abcdef".toCharArray();
        Solution solution = new Solution();
        solution.reverSubStr(c, 0, c.length - 1);

        System.out.println(new String(c));







    }
}
