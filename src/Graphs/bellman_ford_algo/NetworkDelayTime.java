package Graphs.bellman_ford_algo;

import java.util.*;


public class NetworkDelayTime {

    public static int networkDelayTime(int[][] times, int n, int src) {
        int dist[] = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for (int x = 1; x <= n - 1; x++) { // n-1  times edges travel
            for (int i = 0; i < times.length; i++) {
                int u = times[i][0];
                int v = times[i][1];
                int wt = times[i][2];
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }

        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1;
            max = Math.max(max, dist[i]);
        }
        return max;

    }

    public static void main(String[] args) {

        int times[][] = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
//        int times[][] = {{3, 2, 1}, {3, 5, 7}, {3, 1, 5}, {1, 4, 1}, {2, 5, 4}, {2, 4, 6}};
        // send signal from given node k
        // min time it takes for all the n nodes to receive
//        // the signal
        int n = 4; // number of nodes
        int k = 2;
//        int n = 5;
//        int k = 3;
        System.out.println(networkDelayTime(times, n, k));


    }
}
