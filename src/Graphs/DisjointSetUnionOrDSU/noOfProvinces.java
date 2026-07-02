package Graphs.DisjointSetUnionOrDSU;

import java.util.*;

public class noOfProvinces {
    static int parent[];
    static int size[];

    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        parent = new int[n + 1];  // 1-beased indexing
        size = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // edges is from i+1 to j+1
                if (i != j && isConnected[i][j] == 1) {
                    // connecting group leaders of i+1 and j+1
                    union(i + 1, j + 1);
                }
            }
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (parent[i] == i) {
                cnt++;
            }
        }
        return cnt;

    }

    public static void union(int a, int b) {
        int leaderA = findLeader(a);
        int leaderB = findLeader(b);
        if (leaderA != leaderB) {
            if (size[leaderA] > size[leaderB]) { // leaderA should be parent of leaderB
                parent[leaderB] = leaderA;
                size[leaderA] += size[leaderB];
            } else {
                parent[leaderA] = leaderB;
                size[leaderB] += size[leaderA];
            }
        }
    }

    public static int findLeader(int a) {
        if (parent[a] == a) return a;
        int leader = findLeader(parent[a]);
        parent[a] = leader;// this is called path compression
        return leader;
    }

    public static void main(String[] args) {
        int adj[][] = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(findCircleNum(adj));
    }

}
