package Graphs.DFS;

import java.util.*;

public class noOfProvinces {
    public static int findCircleNum(int[][] adj) {
        int n = adj.length;
        boolean isVis[] = new boolean[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!isVis[i]) {
                dfs(i, isVis, adj);
                cnt++;
            }
        }
        return cnt;


    }

    private static void dfs(int i, boolean[] isVis, int[][] adj) {
        int n = adj.length;
        isVis[i] = true;
        for (int j = 0; j < n; j++) {
            if (adj[i][j] == 1 && isVis[j] == false) {
                dfs(j, isVis, adj);
            }
        }
    }

    public static void main(String[] args) {
        int adj[][] = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(findCircleNum(adj));

    }
}
