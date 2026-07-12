package Dynamic_Programming.TwoD_Dp.knapsack.unbounded_knapsack;

import java.util.*;

public class findMaxProfit {
    // method ->1 recursion
    /*
    public static int profit(int i, int[] wt, int[] price, int c) {
        if (i >= wt.length) return 0;
        int skip = profit(i + 1, wt, price, c);
        if (wt[i] > c) return skip;
        int pick = price[i] + profit(i + 1, wt, price, c - wt[i]);
        return Math.max(pick, skip);

    }
     */

    // method -> using memoization
    public static int profit(int i, int[] wt, int[] price, int c, int[][] dp) {
        if (i >= wt.length) return 0;
        if (dp[i][c] != -1) return dp[i][c];
        int skip = profit(i + 1, wt, price, c, dp);
        if (wt[i] > c) return dp[i][c] = skip;
        int pick = price[i] + profit(i , wt, price, c - wt[i], dp);
        return dp[i][c] = Math.max(pick, skip);

    }

    public static void main(String[] args) {
        int[] price = {6, 3, 7, 25};
        int[] wt = {2, 2, 8, 9};
        int c = 9;
        int n = price.length;
        // i = 0 to n-1 and c = c to 0
        int[][] dp = new int[n][c + 1];
        for (int[] rows : dp) {
            Arrays.fill(rows, -1);
        }
        System.out.println(profit(0, wt, price, c, dp));
    }
}
