package Graphs.DFS;

import java.util.ArrayList;

public class findIfPathExistInGraph {
    public static boolean validPaths(int n, int[][] edges, int st, int ed) {
        ArrayList<Integer>[] adj = new ArrayList[n]; // list of array
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        // converted edges array in adj list taki bfs laga sake
        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);

        }
        boolean[] isVis = new boolean[n];
        dfs(st, adj, isVis, ed);
        return isVis[ed];
    }

    private static void dfs(int st, ArrayList<Integer>[] adj, boolean[] isVis, int ed) {
        isVis[st] = true;
        for (int v : adj[st]) {
            if (!isVis[v]) {
                dfs(v, adj, isVis, ed);
            }
            if (v == ed) return;
        }

    }

    public static void main(String[] args) {
        int edges[][] = {{0, 1}, {1, 2}, {2, 0}};
        int n = edges.length;
        int st = 0;
        int ed = 2;
        System.out.println(validPaths(n, edges, st, ed));


    }
}
