package Dynamic_Programming.TwoD_Dp.knapsack.unbounded_knapsack;

import java.util.*;

public class coin_change {

    // method -1 recursion
    /*
    public static int coinChange(int[] coins, int amount) {
        int ans = (int) coinCount(0, coins, amount);
        if (ans == Integer.MAX_VALUE) return -1;
        return ans;

    }

    public static long coinCount(int i, int[] coins, int amount) {
        if (i == coins.length) {
            if (amount == 0) return 0;
            else return Integer.MAX_VALUE;
        }
        long skip = coinCount(i + 1, coins, amount);
        if (amount - coins[i] < 0) return skip;
        long pick = 1L + coinCount(i, coins, amount - coins[i]);
        return Math.min(pick, skip);
    }

     */

    // method -2 memoization

/*
    public static long coinCount(int i, int[] coins, int amount, long[][] dp) {
        int n = coins.length;
        if (i == n) {
            if (amount == 0) return 0;
            else return Integer.MAX_VALUE;
        }
        if (dp[i][amount] != -1) return dp[i][amount];
        long skip = coinCount(i + 1, coins, amount, dp);
        if (amount - coins[i] < 0) return dp[i][amount] = skip;
        long pick = 1L + coinCount(i, coins, amount - coins[i], dp);
        return dp[i][amount] = Math.min(pick, skip);
    }

    public static int coinChange(int[] coins, int amount) {
        long[][] dp = new long[coins.length][amount + 1];
        for (long[] rows : dp) {
            Arrays.fill(rows, -1);
        }
        int ans = (int) coinCount(0, coins, amount, dp);
        if (ans == Integer.MAX_VALUE) return -1;
        return ans;

    }
    */

    // method -3 tabulation
/*
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long[][] dp = new long[n][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                long skip = Integer.MAX_VALUE;
                if (i - 1 >= 0) {
                    skip = dp[i - 1][j];
                } else if (j == 0) {
                    skip = 0;
                }
                if (j - coins[i] < 0) dp[i][j] = skip;
                else {
                    long pick = 1 + dp[i][j - coins[i]];
                    dp[i][j] = Math.min(pick, skip);
                }
            }
        }
        int ans = (int) dp[n - 1][amount];
        if (ans == Integer.MAX_VALUE) return -1;
        return ans;

    }
*/

    // space optimization

    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long[][] dp = new long[2][amount + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                long skip = Integer.MAX_VALUE;
                if (i - 1 >= 0) {
                    skip = dp[0][j];
                } else if (j == 0) {
                    skip = 0;
                }
                if (j - coins[i] < 0) dp[1][j] = skip;
                else {
                    long pick = 1 + dp[1][j - coins[i]];
                    dp[1][j] = Math.min(pick, skip);
                }
            }
            // copy paste
            for (int j = 0; j < amount + 1; j++) {
                dp[0][j] = dp[1][j];
            }
        }
        int ans = (int) dp[1][amount];
        if (ans == Integer.MAX_VALUE) return -1;
        return ans;

    }

    // main function
    public static void main(String[] args) {
        int arr[] = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(arr, amount));

    }
}
