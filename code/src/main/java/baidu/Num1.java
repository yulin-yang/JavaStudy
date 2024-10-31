package baidu;


import java.util.*;

class Solution {

    public boolean isSub(String sub, String s) {
        //sub是否是s的子序列
        int sIndex = 0;
        int subIndex = 0;

        while(sIndex < s.length() && subIndex < sub.length()) {
            if(s.charAt(sIndex) == sub.charAt(subIndex)) {
                subIndex++;
            }
            sIndex++;
        }
        return subIndex == sub.length();
    }

    public List<Integer> isFeihua(String s, String[] ss) {

        Set<String> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < ss.length; i++) {
            if(isSub(s, ss[i])) {
                if(!set.contains(ss[i])) {
                    set.add(ss[i]);
                    res.add(i+1);
                }
            }
        }
        return res;
    }
}

public class Num1 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int size = in.nextInt();
        in.nextLine();
        String[] ss = new String[size];
        for(int i = 0; i < size; i++) {
            ss[i] = in.nextLine();
        }
        List<Integer> res = new ArrayList<>();
        res = new Solution().isFeihua(s, ss);
        System.out.println(res.size());
        for (Integer re : res) {
            System.out.print(re + " ");
        }

    }
}
