package Graphs.DijktraAlgo;

import java.util.*;

public class cheapestFlightsWithinKStops {
    public static class Triplet implements Comparable<Triplet> {
        int node;
        int cost;
        int stops;

        Triplet(int node, int cost, int stops) {
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }

        @Override
        public int compareTo(Triplet o) {
            if (this.stops == o.stops) return this.cost - o.cost;
            return this.stops - o.stops;
        }


    }

    public static class Pair {
        int node;
        int cost;


        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;

        }

    }

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Pair>());
        }
        for (int arr[] : flights) {
            int from = arr[0];
            int to = arr[1];
            int cost = arr[2];
            adj.get(from).add(new Pair(to, cost));
        }
        int ans[] = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        PriorityQueue<Triplet> minHeap = new PriorityQueue<>();
        minHeap.offer(new Triplet(src, 0, 0));
        ans[src] = 0;
        while (!minHeap.isEmpty()) {
            Triplet top = minHeap.poll();
            int node = top.node;
            int cost = top.cost;
            int stops = top.stops;
            if (stops == k + 1) continue;
            for (Pair p : adj.get(node)) {
                int totalCost = cost + p.cost;
                if (totalCost < ans[p.node]) {
                    ans[p.node] = totalCost;
                    minHeap.offer(new Triplet(p.node, totalCost, stops + 1));
                }
            }
        }
        if (ans[dst] == Integer.MAX_VALUE) return -1;
        return ans[dst];

    }

    public static void main(String[] args) {
        int n = 4;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {1, 3, 600}, {2, 0, 100}, {2, 3, 200}};
        int src = 0;
        int dst = 3;
        int k = 1;
        System.out.println(findCheapestPrice(n, flights, src, dst, k));
    }

}
