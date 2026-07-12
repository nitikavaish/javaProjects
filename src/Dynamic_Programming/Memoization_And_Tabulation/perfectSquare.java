package Dynamic_Programming.Memoization_And_Tabulation;

import java.util.*;

public class perfectSquare {

    //method -1 recursion
    /*
    public static boolean isPerfect(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static int numSquares(int n) {
        if (isPerfect(n)) return 1;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i*i <= n; i++) {
            int cnt = numSquares(n - i*i) + numSquares(i*i);
            min = Math.min(min, cnt);
        }
        return min;

    }
     */

    //method -2  memoization
    /*

    public static boolean isPerfect(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static int minSquares(int n, int dp[]) {
        if (isPerfect(n)) return 1;
        int min = Integer.MAX_VALUE;
        if (dp[n] != -1) return dp[n];
        for (int i = 1; i * i <= n; i++) {
            int cnt = minSquares(n - i * i, dp) + minSquares(i * i, dp);
            min = Math.min(min, cnt);
        }
        return dp[n] = min;

    }

    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return minSquares(n, dp);
    }

     */

    // method -> 3  tabulation

    public static boolean isPerfect(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) dp[i] = 1;
            else {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j * j <= i; j++) {
                    int cnt = dp[j * j] + dp[i - j * j];
                    min = Math.min(min, cnt);
                }
                dp[i] = min;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }
}
