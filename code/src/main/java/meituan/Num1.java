package meituan;

import java.util.Scanner;


class Solutinon{

    public boolean isHao(int n) {
        int ji = 0;
        int res = 0;
        while(n != 0) {
            int m = n % 10;
            if(m % 2 == 1) {
                ji++;
            }
            res += m;
            n = n / 10;
        }

        if(res % 2 == 0 && ji != 0) {
            return true;
        }else {
            return false;
        }
    }

    public  int haoNumber(int[] arrays) {
        int res = 0;
        int n = arrays.length;
        if(n == 0) {
            return res;
        }

        for(int i = 0; i < n; i++) {
            if(isHao(arrays[i])) {
                res++;
            }
        }
        return res;

    }
}

public class Num1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        // 注意 hasNext 和 hasNextLine 的区别

        int[] arryas = new int[num];
        for(int i = 0; i < num; i++) {
            arryas[i] = in.nextInt();
        }
        System.out.println(new Solutinon().haoNumber(arryas));

    }
}
