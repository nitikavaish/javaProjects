package Graphs.bellman_ford_algo;

import java.util.*;

public class negativeCycleDetection {
    public static boolean Neg_CycleDetection(int[][] edges, int n, int src) {
        int dist[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for (int x = 1; x <= n - 1; x++) { // n-1 time edge relaxing
            boolean updated = false;
            for (int i = 0; i < edges.length; i++) {
                int u = edges[i][0], v = edges[i][1], dis = edges[i][2];
                if (dist[u] != Integer.MAX_VALUE && dist[u] + dis < dist[v]) {
                    dist[v] = dist[u] + dis;
                    updated = true;
                }
            }
            if (!updated) break;
        }
        for (int i = 0; i < edges.length; i++) {  // nth time edge relaxing for detecting -ve cycle
            int u = edges[i][0], v = edges[i][1], dis = edges[i][2];
            if (dist[u] != Integer.MAX_VALUE && dist[u] + dis < dist[v]) {
                return true;
            }
        }

        return false;

    }
    public static void main(String[] args) {
//        int edges[][] = {{2, 3, -6}, {1, 2, 2}, {0, 1, 1}, {3, 0, 1}};
        int edges[][] = {{2, 3, 5}, {1, 2, 2}, {0, 1, 1}, {3, 0, 1}};
        int n = 4;
        int src = 0;
        System.out.println(Neg_CycleDetection(edges, n, src));
    }
}
