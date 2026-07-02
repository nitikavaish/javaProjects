package Graphs.DijktraAlgo;

import java.util.*;

public class findSafeWalkThroughGrid {
    public static class Triplet implements Comparable<Triplet> {
        int row;
        int col;
        int health;

        public Triplet(int row, int col, int health) {
            this.row = row;
            this.col = col;
            this.health = health;
        }

        public int compareTo(Triplet o) {
            if (this.health == o.health) return Integer.compare(this.row, o.row);
            return Integer.compare(this.health, o.health);
        }
    }

    public static boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n = grid.size();
        int m = grid.get(0).size();

        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        int maxHealth[][] = new int[n][m];
        for (int row[] : maxHealth) {
            Arrays.fill(row, -1);
        }
        int startHealth = health - grid.get(0).get(0);
        pq.add(new Triplet(0, 0, startHealth));

        int dir[][] = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (pq.size() > 0) {
            Triplet top = pq.remove();
            int r = top.row;
            int c = top.col;
            int h = top.health;
            if (r == n - 1 && c == m - 1 && h >= 1) return true;
            for (int d[] : dir) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    int newHealth = h - grid.get(nr).get(nc);
                    if (newHealth > maxHealth[nr][nc]) {
                        maxHealth[nr][nc] = newHealth;
                        pq.add(new Triplet(nr, nc, newHealth));
                    }

                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int edges[][] = {{0, 1, 1, 0, 0, 0}, {1, 0, 1, 0, 0, 0}, {0, 1, 1, 1, 0, 1}, {0, 0, 1, 0, 1, 0}};
        List<List<Integer>> grid = new ArrayList<>();
        for (int i = 0; i < edges.length; i++) {
            grid.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                grid.get(i).add(edges[i][j]);
            }
        }
        int health = 3;
        System.out.println(findSafeWalk(grid, health));

    }
}
