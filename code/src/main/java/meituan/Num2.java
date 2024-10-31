package meituan;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solutinon2{
    public int theLeast(int n, int k, int[] arrays) {

        int res = 0;
        if(arrays.length == 0) {
            return res;
        }
        Set<Integer> set = new HashSet<>();


        for(int i = 0; i < k; i++) {
            for (int array : arrays) {
                set.add(array);
            }
            for(int j = 0; j < arrays.length; j++) {
                arrays[j]++;
            }

            if(set.size() >= k) {
                res = i + 1;
                return res;
            }
        }
        return res;
    }

}
public class Num2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] array = new int[n];
        for(int i =0; i < n; i++) {
            array[i] = in.nextInt();
        }

        System.out.println(new Solutinon2().theLeast(n, k, array));


    }
}
