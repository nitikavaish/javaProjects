package Graphs.DijktraAlgo;

import java.util.*;

public class findSafestPathInGrid {
    public static class Pair {
        int row, col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static class Triplet implements Comparable<Triplet> {
        int row, col, dist;

        public Triplet(int row, int col, int dist) {
            this.row = row;
            this.col = col;
            this.dist = dist;

        }

        @Override
        public int compareTo(Triplet o) {
            return Integer.compare(dist, o.dist);
        }
    }

    public static int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        // multisource bfs
        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<Pair> q = new LinkedList<>();
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MIN_VALUE);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    q.offer(new Pair(i, j));
                    dist[i][j] = 0;
                }
            }
        }
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;
            for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && dist[nr][nc] == Integer.MIN_VALUE) {
                    dist[nr][nc] = dist[r][c] + 1;
                    q.offer(new Pair(nr, nc));
                }
            }
        }

        // dijstra algo
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());  // max heap
        int best[][] = new int[n][n];
        for (int[] row : best) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }
        pq.offer(new Triplet(0, 0, dist[0][0]));
        best[0][0] = dist[0][0];
        while (!pq.isEmpty()) {

            Triplet t = pq.poll();
            int r = t.row;
            int c = t.col;
            int safe = t.dist;
            if (r == n - 1 && c == n - 1) return safe;
            for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                    int newSafe = Math.min(dist[nr][nc], safe);
                    if (newSafe > best[nr][nc]) {
                        best[nr][nc] = newSafe;
                        pq.offer(new Triplet(nr, nc, newSafe));
                    }
                }
            }
        }
        return best[n - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 0, 0}, {0, 0, 0}, {0, 0, 1}};
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                list.get(i).add(grid[i][j]);
            }
        }
        System.out.println("input list " + list);
        System.out.println(maximumSafenessFactor(list));

    }
}
