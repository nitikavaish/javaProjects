package Graphs.DijktraAlgo;

import java.util.*;

public class pathWithMinEffort {
    public static class Triplet implements Comparable<Triplet> {
        int row;
        int col;
        int effort;

        public Triplet(int row, int col, int effort) {
            this.row = row;
            this.col = col;
            this.effort = effort;
        }

        @Override
        public int compareTo(Triplet o) {
            return Integer.compare(effort, o.effort);
        }
    }

    public static int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        PriorityQueue<Triplet> minHeap = new PriorityQueue<>();
        int ans[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ans[i], Integer.MAX_VALUE);
        }
        //  for travel in four direction
        int[] r = {-1, 0, 1, 0};
        int[] c = {0, -1, 0, 1};
        minHeap.offer(new Triplet(0, 0, 0));
        ans[0][0] = 0;
        while (!minHeap.isEmpty()) {
            Triplet top = minHeap.poll();
            int row = top.row;
            int col = top.col;
            int prevEff = top.effort;
            if (row == n - 1 && col == m - 1) return prevEff;
            // optimization
            if (ans[row][col] < prevEff) continue;
            for (int i = 0; i <= 3; i++) {
                int newRow = row + r[i];
                int newCol = col + c[i];
                if (newRow < 0 || newRow > n - 1 || newCol < 0 || newCol > m - 1) continue;
                int currEffort = Math.abs(heights[row][col] - heights[newRow][newCol]);
                currEffort = Math.max(prevEff, currEffort);
                if (ans[newRow][newCol] > currEffort) {
                    ans[newRow][newCol] = currEffort;
                    minHeap.offer(new Triplet(newRow, newCol, currEffort));
                }
            }
        }
        return ans[n - 1][m - 1];
    }

    public static void main(String[] args) {
        int height[][] = {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        System.out.println(minimumEffortPath(height));

    }
}
