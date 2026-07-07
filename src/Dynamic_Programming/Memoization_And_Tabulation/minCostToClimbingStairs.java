package Dynamic_Programming.Memoization_And_Tabulation;

public class minCostToClimbingStairs {
    // method -> 1 (simple Recursion) --> it will give tle
    /*
    public static int minCost(int[] cost, int idx) {
        if (idx == 0 || idx == 1) return cost[idx];
        return cost[idx] + Math.min(minCost(cost, idx - 1), minCost(cost, idx - 2));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;


        return Math.min(minCost(cost, n - 1), minCost(cost, n - 2));
    }
    */

    // method -2 --> (recursion + memoization )
    /*
    public static int minCost(int[] cost, int idx, int dp[]) {
        if (idx == 0 || idx == 1) return cost[idx];
        if (dp[idx] != -1) return dp[idx];
        int ans = cost[idx] + Math.min(minCost(cost, idx - 1, dp), minCost(cost, idx - 2, dp));
        dp[idx] = ans;
        return ans;
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // n is going to n-1 to 0;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(minCost(cost, n - 1, dp), minCost(cost, n - 2, dp));
    }
     */

    // method 2 --> (Tabulation)

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // n is going to n-1 to 0;
        int dp[] = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);

        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }

    public static void main(String[] args) {
        int cost[] = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));

    }
}
