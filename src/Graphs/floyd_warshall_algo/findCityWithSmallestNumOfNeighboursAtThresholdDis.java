package Graphs.floyd_warshall_algo;

import java.util.*;

public class findCityWithSmallestNumOfNeighboursAtThresholdDis {
    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0], v = edges[i][1], wt = edges[i][2];
            dist[u][v] = wt;
            dist[v][u] = wt;
        }
        // floyd warshall algo
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                if (i == k) continue;
                for (int j = 0; j < n; j++) {
                    if (j == k) continue;
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
                        dist[i][j] = Math.min(dist[i][j], (dist[i][k] + dist[k][j]));
                    }
                }
            }
        }
        int minCity = -1;
        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int cnt = 0; // from i to j where dist[i][j]<=threshold
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (dist[i][j] <= distanceThreshold) {
                    cnt++;
                }
            }
            if (cnt <= minCount) {
                minCount = cnt;
                minCity = i;
            }
        }
        return minCity;


    }

    public static void main(String[] args) {
        int n = 4;
        int edges[][] = {{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}};
        int t = 4;
        System.out.println(findTheCity(n, edges, t));

    }
}
