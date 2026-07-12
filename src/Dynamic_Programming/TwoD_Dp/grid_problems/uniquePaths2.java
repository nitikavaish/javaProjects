package Dynamic_Programming.TwoD_Dp.grid_problems;

public class uniquePaths2 {
    public static int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if (grid[0][0] == 1 || grid[n - 1][m - 1] == 1) return 0;
        return 0;


    }

    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(uniquePathsWithObstacles(arr));
    }
}
