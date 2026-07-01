package Graphs.PrimsAlgo;

import java.util.*;

public class minCostToConnectAllPoints {
    public static class Triplet implements Comparable<Triplet> {
        int node;
        int parent;
        int dist;

        public Triplet(int node, int parent, int cost) {
            this.node = node;
            this.parent = parent;
            this.dist = cost;
        }

        @Override
        public int compareTo(Triplet o) {
            if (this.dist == o.dist) return Integer.compare(this.node, o.node);
            return Integer.compare(this.dist, o.dist);
        }

        @Override
        public String toString() {
            return "(" + parent + " " + node + " " + dist + ")";
        }
    }

    public static int minCostConnectPoints(int[][] points) {
        int n = points.length;
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0, -1, 0));
        int sum = 0;
        boolean[] visited = new boolean[n];
        while (pq.size() > 0) {
            Triplet t = pq.poll();
            int node = t.node;
            int parent = t.parent;
            int dist = t.dist;
            if (visited[node]) continue;
            sum += dist;
            visited[node] = true;
            for (int i = 0; i < n; i++) {

                if (i == node || i == parent) continue;
                if (visited[i]) continue;
                int x1 = points[node][0], y1 = points[node][1];
                int x2 = points[i][0], y2 = points[i][1];
                int mdis = Math.abs(x2 - x1) + Math.abs(y2 - y1);
                pq.offer(new Triplet(i, node, mdis));


            }

        }
        return sum;

    }

    public static void main(String[] args) {
        int points[][] = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        System.out.println(minCostConnectPoints(points));

    }
}
