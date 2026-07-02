package Graphs.DisjointSetUnionOrDSU;

public class redundantConnection {
    static int parent[];
    static int size[];

    public static int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1];
        size = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        int ans[] = new int[2];
        for (int arr[] : edges) {
            int u = arr[0], v = arr[1];
            if (leader(u) == leader(v)) {
                ans[0] = u;
                ans[1] = v;
                break;
            } else {
                union(u, v);
            }
        }
        return ans;

    }

    public static void union(int u, int v) {
        int lu = leader(u);
        int lv = leader(v);
        if (lu == lv) return;
        if (size[lu] < size[lv]) {
            parent[lu] = lv;
            size[lv] += size[lu];
        } else {
            parent[lv] = lu;
            size[lu] += size[lv];
        }

    }

    public static int leader(int a) {
        if (parent[a] == a) return a;
        int leader = leader(parent[a]);
        parent[a] = leader;
        return leader;

    }

    public static void main(String[] args) {
        int edges[][] = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        int res[] = findRedundantConnection(edges);
        for (int ele : res) {
            System.out.print(ele + " ");
        }

    }
}
