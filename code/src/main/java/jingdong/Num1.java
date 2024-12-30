package jingdong;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Num1 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        List<String> list = new ArrayList<>();
        //res记录答案
        List<String> res = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(in.nextLine());
        }

        //前 n 个的公共前缀
        for(int i = 0; i < list.size(); i++) {

            String s = res.get(res.size() - 1);
            int index = s.length();
            for(int j = index; j < list.size();) {
                if(index == list.get(j).length() || list.get(j).charAt(index) != list.get(0).charAt(index)) {
                    break;
                }
            }
            s += list.get(0).charAt(index);
            res.add(s);
            list.remove(list.size() - 1);
        }

    }
}
