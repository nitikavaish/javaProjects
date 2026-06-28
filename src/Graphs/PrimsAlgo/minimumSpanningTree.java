package Graphs.PrimsAlgo;

import java.util.*;

public class minimumSpanningTree {
    public static class Triplet implements Comparable<Triplet> {
        int node;
        int parent;
        int cost;

        public Triplet(int node, int parent, int cost) {
            this.node = node;
            this.parent = parent;
            this.cost = cost;
        }

        @Override
        public int compareTo(Triplet o) {
            return Integer.compare(this.cost, o.cost);
        }

        @Override
        public String toString() {
            return "(" + parent + " " + node + " " + cost + ")";
        }
    }

    public static class Pair {
        int node;
        int cost;

        public Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public static int findMinimumSpanningTreeWithMinCostSum(int n, int[][] edges) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0], v = edges[i][1], cost = edges[i][2];
            adj.get(u).add(new Pair(v, cost));
            adj.get(v).add(new Pair(u, cost));
        }

        ArrayList<Triplet> ans = new ArrayList<>();
        int sum = 0;
        boolean[] visited = new boolean[n];
        PriorityQueue<Triplet> min = new PriorityQueue<>();
        min.add(new Triplet(0, -1, 0));
        while (!min.isEmpty()) {
            Triplet top = min.poll();
            int node = top.node;
            int parent = top.parent;
            int cost = top.cost;
            if (visited[node]) continue;
            visited[node] = true;
            for (Pair p : adj.get(node)) {
                if (!visited[p.node]) {
                    min.add(new Triplet(p.node, node, p.cost));
                }

            }
            if (parent != -1) {
                ans.add(new Triplet(parent, node, cost));
                sum += cost;
            }


        }
        System.out.println(ans);
        return sum;

    }

    public static void main(String[] args) {
        int edges[][] = {{0, 1, 2}, {0, 2, 5}, {3, 1, 1}, {3, 2, 5}, {0, 4, 1}, {1, 4, 3}, {2, 4, 2}, {3, 4, 4}};
        int n = 5;
        System.out.println(findMinimumSpanningTreeWithMinCostSum(n, edges));

    }
}
