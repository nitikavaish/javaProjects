package Graphs.DijktraAlgo;

import java.util.*;

public class NetworkDelayTime {
    public static class Pair implements Comparable<Pair> {
        int node;
        int time;

        Pair(int node, int cost) {
            this.node = node;
            this.time = cost;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.time == o.time) return this.node - o.node;
            return this.time - o.time;
        }
    }

    public static int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Pair>());
        }
        for (int[] edge : times) {
            int src = edge[0];
            int dst = edge[1];
            int time = edge[2];
            adj.get(src).add(new Pair(dst, time));
        }
        // dijkstra's algorithm
        // minheap
        int ans[] = new int[n + 1];
        Arrays.fill(ans, Integer.MAX_VALUE);
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();
        minHeap.offer(new Pair(k, 0));
        ans[k] = 0;
        while (minHeap.size() > 0) {
            Pair front = minHeap.poll();
            int node = front.node;
            int time = front.time;
            if (time > ans[node]) continue;
            for (Pair p : adj.get(node)) {
                int totalTime = p.time + time;
                if (ans[p.node] > totalTime) {
                    ans[p.node] = totalTime;
                    minHeap.offer(new Pair(p.node, totalTime));
                }
            }
        }
        //
        int max = -1;
        for (int i = 1; i <= n; i++) {
            // it means signal is not transferred at all nodes
            if (ans[i] == Integer.MAX_VALUE) return -1;
            max = Math.max(max, ans[i]);
        }
        return max;

    }

    public static void main(String[] args) {

        int times[][] = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
//        int times[][] = {{3, 2, 1}, {3, 5, 7}, {3, 1, 5}, {1, 4, 1}, {2, 5, 4}, {2, 4, 6}};

        int n = 4;
        int k = 2;
//        int n = 5;
//        int k = 3;
        System.out.println(networkDelayTime(times, n, k));


    }
}
