package Graphs.BFS;

import java.util.*;

public class numberOfIslands {

    // custom class pair data type
    static class Pair {
        int a, b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void bfs(int row, int col, char arr[][], boolean isVis[][]) {
        int n = arr.length;
        int m = arr[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));
        while (q.size() > 0) {
            Pair front = q.poll();
            int i = front.a;
            int j = front.b;
            // right
            if (j + 1 < m && !isVis[i][j + 1] && arr[i][j + 1] == '1') {
                q.add(new Pair(i, j + 1));
                isVis[i][j + 1] = true;
            }
            //down
            if (i + 1 < n && !isVis[i + 1][j] && arr[i + 1][j] == '1') {
                q.add(new Pair(i + 1, j));
                isVis[i + 1][j] = true;
            }

            //up
            if (i - 1 >= 0 && !isVis[i - 1][j] && arr[i - 1][j] == '1') {
                q.add(new Pair(i - 1, j));
                isVis[i - 1][j] = true;
            }
            //left
            if (j - 1 >= 0 && !isVis[i][j - 1] && arr[i][j - 1] == '1') {
                q.add(new Pair(i, j - 1));
                isVis[i][j - 1] = true;
            }


        }
    }

    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean isVis[][] = new boolean[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !isVis[i][j]) {
                    bfs(i, j, grid, isVis);
                    isVis[i][j] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        char arr[][] = {
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        };
        System.out.println(numIslands(arr));

    }
}
