package Dynamic_Programming.TwoD_Dp.knapsack.unbounded_knapsack;

import java.util.*;

public class targetSum {
    static int sum;

    public static int countWays(int idx, int[] nums, int res, int target, int[][] dp) {
        if (idx == nums.length) {
            if (res == target) return 1;
            else return 0;
        }
        if (dp[idx][res + sum] != -1) return dp[idx][res + sum];
        int sub = countWays(idx + 1, nums, res + nums[idx], target, dp);
        int add = countWays(idx + 1, nums, res - nums[idx], target, dp);
        return dp[idx][res+ sum] = sub + add;

    }

    public static int findTargetSumWays(int[] nums, int target) {

        sum = 0;
        for (int num : nums) sum += num;

        // i-0 to n-1 | target --> -sum to +sum
        int[][] dp = new int[nums.length][2 * sum + 1];
        for (int[] rows : dp) {
            Arrays.fill(rows, -1);
        }
        return countWays(0, nums, 0, target, dp);

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(findTargetSumWays(arr, target));

    }
}
