package Graphs.kruskal_Algo;

import java.util.*;

public class minCostToConnectAllPoints {
    static int parent[];
    static int size[];

    public static class Triplet implements Comparable<Triplet> {
        int u;
        int v;
        int dist;

        public Triplet(int u, int v, int dist) {
            this.u = u;
            this.v = v;
            this.dist = dist;
        }

        @Override
        public int compareTo(Triplet o) {
            if (this.dist == o.dist) return Integer.compare(this.u, o.u);
            return Integer.compare(this.dist, o.dist);
        }
    }

    public static int minCostConnectPoints(int[][] points) {
        int n = points.length; // number of nodes
        ArrayList<Triplet> list = new ArrayList<>(); // min heap distance ke basis  par sort kar dega
        for (int i = 0; i < points.length; i++) {
            int arr[] = points[i];
            int x1 = arr[0];
            int y1 = arr[1];
            for (int j = i + 1; j < points.length; j++) {
                int brr[] = points[j];
                int x2 = brr[0];
                int y2 = brr[1];
                int dist = Math.abs(x2 - x1) + Math.abs(y2 - y1);
                list.add(new Triplet(i, j, dist));

            }

        }
        return ApplyDSU(list, n);
    }

    public static int ApplyDSU(ArrayList<Triplet> list, int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        Collections.sort(list);
        int minCost = 0;
        for (int i = 0; i < list.size(); i++) {
            Triplet top = list.get(i);
            int u = top.u;
            int v = top.v;
            int dist = top.dist;
            if (leader(u) != leader(v)) {
                union(u, v);
                minCost += dist;
            }

        }
        return minCost;
    }

    public static void union(int u, int v) {
        int lu = leader(u);
        int lv = leader(v);
        if (lu != lv) {
            if (size[lu] < size[lv]) {
                parent[lu] = lv;
                size[lv] += size[lu];
            } else {
                parent[lv] = lu;
                size[lu] += size[lv];
            }
        }
    }

    public static int leader(int a) {
        if (parent[a] == a) return a;
        int l = leader(parent[a]);
        parent[a] = l;
        return l;
    }

    public static void main(String[] args) {
        int points[][] = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        System.out.println(minCostConnectPoints(points));

    }
}
