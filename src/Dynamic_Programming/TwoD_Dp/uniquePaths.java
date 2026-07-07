package Dynamic_Programming.TwoD_Dp;

import java.util.*;

public class uniquePaths {
    // method -1  Recursion
    public static int paths(int row, int col, int er, int ec) {
        if (row >= er || col >= ec)
            return 0;
        if (row == er - 1 && col == ec - 1)
            return 1;
        return paths(row, col + 1, er, ec) + paths(row + 1, col, er, ec);
    }

    public static int uniquePaths(int m, int n) {
        return paths(0, 0, m, n);

    }

    // method - 2  Memoization and Recursion
/*
    public static int paths(int row, int col, int er, int ec, int dp[][]) {
        if (row >= er || col >= ec)
            return 0;
        if (row == er - 1 && col == ec - 1)
            return 1;
        if (dp[row][col] != -1)
            return dp[row][col];
        return dp[row][col] = paths(row, col + 1, er, ec, dp) + paths(row + 1, col, er, ec, dp);
    }

    public static int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int rows[] : dp) {
            Arrays.fill(rows, -1);
        }
        return paths(0, 0, m, n, dp);

    }
 */
    //    method -3 Tabulation
    /*
    public static int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int rows[] : dp) {
            Arrays.fill(rows, -1);
        }
        // dp[0][0] = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[m - 1][n - 1];
    }

     */

    public static void main(String[] args) {
        int m = 4;
        int n = 6;
        System.out.println(uniquePaths(m, n));

    }
}
