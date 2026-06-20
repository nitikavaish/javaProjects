package Graphs.DFS;


import java.util.ArrayList;

// course schedule using dfs
public class cycleDetectionInDirectedGraph {
    static boolean ans;

    public static void dfs(int st, ArrayList<Integer>[] adj, boolean[] visited, boolean[] path) {
        visited[st] = true;
        path[st] = true;
        for (int ele : adj[st]) {
            if (path[ele] == true) {
                ans = true; //false means there is a cycle
                return;
            }
            if (!visited[ele]) dfs(ele, adj, visited, path);
        }
        path[st] = false;
    }

    private static boolean isCycle(int n, int[][] arr) {
        ans = false;// true means no cycle
        // build directed graph
        ArrayList<Integer>[] adj = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] p : arr) {
            adj[p[1]].add(p[0]);
        }
        boolean[] visited = new boolean[n];
        boolean path[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, path);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int edges[][] = {{0, 1}, {1, 0}};
        int n = 2;
        boolean res = isCycle(n, edges);
        System.out.print("is cycle present  = " + res);

    }


}

