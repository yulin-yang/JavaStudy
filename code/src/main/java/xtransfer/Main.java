package xtransfer;

import java.util.*;

class Solution {
    public static void Mind(String str, int k) {



    }
}


// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str  = in.nextLine();
        int k = in.nextInt();
        String s = new String();
        List<Integer> size = new ArrayList<>();

        s += str.charAt(0);
        int count = 1;

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(i - 1)) {
                size.add(count);
                s += str.charAt(i);
                count = 1;
            }else {
                count++;
                if( i == str.length() - 1) {
                    size.add(count);
                }
            }
        }

        System.out.println(s);
        for (Integer i : size) {
            System.out.print(i + "  ");

        }



        int min = 0;
        int pos = 0;
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < array.length; j++) {
                if((int)array[j] < min) {
                    min = (int)array[j];
                    pos = j;
                }
            }
            (int)(array[pos]) += 10;
        }




    }
}