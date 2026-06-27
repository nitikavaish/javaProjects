package Graphs.DijktraAlgo;

import java.util.*;

public class pathWithMaxProbability {
    public static class Pair implements Comparable<Pair> {
        int node;
        double prob;

        Pair(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.prob == o.prob) return this.node - o.node;
            return Double.compare(this.prob, o.prob);
        }
    }

    public static double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Pair>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];
            adj.get(u).add(new Pair(v, prob));
            adj.get(v).add(new Pair(u, prob));
        }
        double ans[] = new double[n];

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(new Pair(start, 1));
        ans[start] = 1;
        while (!maxHeap.isEmpty()) {
            Pair front = maxHeap.poll();
            int node = front.node;
            double prob = front.prob;
            if (prob < ans[node]) continue;
            for (Pair p : adj.get(node)) {
                double totalProb = prob * p.prob;
                if (totalProb > ans[p.node]) {
                    ans[p.node] = totalProb;
                    maxHeap.offer(new Pair(p.node, totalProb));
                }
            }

        }

        return ans[end];

    }

    public static void main(String[] args) {
        int n = 3;
        int edges[][] = {{0, 1}, {1, 2}, {0, 2}};
        double[] succProb = {0.5, 0.5, 0.2};
        int start = 0;
        int end = 2;
        System.out.println(maxProbability(n, edges, succProb, start, end));

    }
}
