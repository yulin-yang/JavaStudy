package baidu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution2 {

    int maxDepth;


    public void dfs(int node, int depth, int parent) {
        maxDepth = Math.max(maxDepth, depth);
    }

    public List<Integer> computeDepth(int[][] tree) {

        return null;

    }

}

public class Num2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] val = new int[n];

        for(int i = 1; i < n; i++) {
            val[i] = in.nextInt();
        }

        int[][] tree = new int[n][n];

        for (int[] ints : tree) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }

        for(int i = 0; i < n - 1; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            tree[u][v] = tree[v][u] = 1;
        }

        for (int[] ints : tree) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
