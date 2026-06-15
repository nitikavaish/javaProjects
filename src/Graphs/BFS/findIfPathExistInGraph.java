package Graphs.BFS;

import java.util.*;

public class findIfPathExistInGraph {

    public static void bfs(int st, ArrayList<Integer>[] adj, boolean[] isVis, int ed) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(st);
        while (q.size() > 0) {
            int front = q.poll();
            for (int ele : adj[front]) {
                if (isVis[ele] == false) {
                    q.add(ele);
                    isVis[ele] = true;
                    if (ele == ed) return;
                }
            }
        }
    }

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
        bfs(st, adj, isVis, ed);
        return isVis[ed];
    }

    public static void main(String[] args) {
        int edges[][] = {{0, 1}, {1, 2}, {2, 0}};
        int n = edges.length;
        int st = 0;
        int ed = 2;
        System.out.println(validPaths(n, edges, st, ed));


    }
}
