package Dynamic_Programming.Memoization_And_Tabulation;

public class fibonacciSeries {

    // method -> 1 (recursion)
    /*
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);

    }
     */

    // method 2 - (Memoization+Recursion)
/*

    public static int fibo(int n, int[] dp) {
        if (n <= 1) return n;
        if (dp[n] != 0) return dp[n];
        int ans = fibo(n - 1, dp) + fibo(n - 2, dp);
        dp[n] = ans;
        return ans;
    }

    public static int fib(int n) {
        int[] dp = new int[n + 1];
        return fibo(n, dp);
    }

 */

    // method --> 3 (Tabulation)
/*
    public static int fib(int n) {
        if (n <= 1) return n;
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    */

    // method --> 4(Tabulation+space optimization)
    public static int fib(int n) {
        if (n <= 1) return n;
        int dp[] = new int[3];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[2] = dp[1] + dp[0];
        }
        return dp[2];
    }


    public static void main(String[] args) {
        int n = 2;
        System.out.println(fib(n));

    }
}
