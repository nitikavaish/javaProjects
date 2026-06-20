package Graphs.DFS;

import java.util.*;;

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
                visited[i] = 0;
                usingDFS(i, graph, visited);


            }

        }
        return ans;
    }

    private static void usingDFS(int st, int[][] graph, int[] visited) {
        ans = true;
        for (int child : graph[st]) {
            int parentColor = visited[st];
            if (visited[child] == -1) {
                visited[child] = 1 - parentColor;
                usingDFS(child, graph, visited);
            }
            if (visited[child] == parentColor) {
                ans = false;
                return;
            }
        }


    }

    public static void main(String[] args) {
        int graph[][] = {{1}, {0}, {4}, {4}, {2, 3}};
//        int graph[][] = {{4, 1}, {0, 2}, {1, 3}, {2, 4}, {3, 0}};
        System.out.println(isBipartite(graph));

    }
}
