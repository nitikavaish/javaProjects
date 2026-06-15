package Graphs.DFS;

public class noOfIslands {
    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean isVis[][] = new boolean[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && isVis[i][j] == false) {
                    dfs(i, j, grid, isVis);
                    isVis[i][j] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static void dfs(int i, int j, char[][] grid, boolean[][] isVis) {
        int n = grid.length;
        int m = grid[0].length;
        isVis[i][j] = true;
        //left
        if (j - 1 >= 0 && grid[i][j - 1] == '1' && isVis[i][j - 1] == false) {
            dfs(i, j - 1, grid, isVis);
            isVis[i][j - 1] = true;
        }
        //top
        if (i - 1 >= 0 && grid[i - 1][j] == '1' && isVis[i - 1][j] == false) {
            dfs(i - 1, j, grid, isVis);
            isVis[i - 1][j] = true;
        }
        // right
        if (j + 1 < m && grid[i][j + 1] == '1' && isVis[i][j + 1] == false) {
            dfs(i, j + 1, grid, isVis);
            isVis[i][j + 1] = true;
        }
        // bottem
        if (i + 1 < n && grid[i + 1][j] == '1' && isVis[i + 1][j] == false) {
            dfs(i + 1, j, grid, isVis);
            isVis[i + 1][j] = true;
        }

    }

    public static void main(String[] args) {
        char grid[][] = {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        System.out.println(numIslands(grid));

    }
}
