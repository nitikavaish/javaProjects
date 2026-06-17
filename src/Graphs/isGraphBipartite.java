package Graphs;

import java.util.*;

public class isGraphBipartite {
    static boolean ans;

    public static boolean isBipartite(int[][] graph) {
        ans = true;
        int n = graph.length;
        int[] visited = new int[n];
        Arrays.fill(visited, -1);
        for (int i = 0; i < n; i++) {
            if (!ans) return ans;
            if (visited[i] == -1) {
                usingBFS(i, graph, visited);
                if (i - 1 >= 0) {
                    int color = visited[i - 1];
                }

            }

        }
        return ans;
    }

    private static void usingBFS(int st, int[][] graph, int[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(st);
        visited[st] = 0;
        while (queue.size() > 0) {
            int front = queue.poll();
            int color = visited[front];
            for (int ele : graph[front]) {
                if (visited[ele] == visited[front]) {
                    ans = false;
                    return;
                }
                if (visited[ele] == -1) {
                    visited[ele] = 1 - color;
                    queue.add(ele);
                }
            }
        }
    }

    public static void main(String[] args) {
        int graph[][] = {{1}, {0}, {4}, {4},{2,3}};
        System.out.println(isBipartite(graph));

    }
}
