package Graphs.kruskal_Algo;

import java.util.*;

public class isGraphBipartite {
    static int parent[];
    static int size[];
    static boolean parity[];

    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        parent = new int[n];
        size = new int[n];
        parity = new boolean[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
            parity[i] = false;
        }
        for (int i = 0; i < n; i++) {
            for (int ele : graph[i]) {
                if (ele < i) continue;
                int u = i;
                int v = ele;
                if (leader(u) != leader(v)) {
                    union(u, v, parity);
                } else {
                    // cycle detect // ye number of cycles bta dega
                    if (parity[u] == parity[v]) return false;
                }
            }
        }
        return true;

    }

    public static void union(int u, int v, boolean parity[]) {
        int lu = leader(u);
        int lv = leader(v);
        if (lu != lv) {
            if (size[lu] < size[lv]) {
                parent[lu] = lv;
                size[lv] += size[lu];
                parity[u] = !parity[v];  // child ki parity change
            } else {
                parent[lv] = lu;
                size[lu] += size[lv];
                parity[v] = !parity[u];
            }

        }
    }

    public static int leader(int u) {
        if (parent[u] == u) return u;
        int l = leader(parent[u]);
        parent[u] = l;
        return l;
    }
    public static void main(String[] args) {
        int graph[][] = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        System.out.println(isBipartite(graph));

    }
}
