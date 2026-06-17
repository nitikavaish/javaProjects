package Graphs.DFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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
                usingDFS(i, graph, visited);
                if (i - 1 >= 0) {
                    int color = visited[i - 1];
                }

            }

        }
        return ans;
    }

    private static void usingDFS(int st, int[][] graph, int[] visited) {

    }

    public static void main(String[] args) {
        int graph[][] = {{1}, {0}, {4}, {4}, {2, 3}};
        System.out.println(isBipartite(graph));

    }
}
