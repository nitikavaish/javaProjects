package Heap;

import java.util.*;

class Triplet implements Comparable<Triplet> {
    int dist;
    int x;
    int y;

    Triplet(int dist, int x, int y) {
        this.dist = dist;
        this.x = x;
        this.y = y;

    }

    @Override
    public int compareTo(Triplet o) {
        // in increasing order
        return Integer.compare(this.dist, o.dist);
    }

}

public class k_ClosestPointsToOrigin {
    public static int[][] k_Closest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            int dist = x * x + y * y;
            pq.add(new Triplet(dist, x, y));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            Triplet t = pq.poll();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int ans[][] = k_Closest(arr, 2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }


    }
}
