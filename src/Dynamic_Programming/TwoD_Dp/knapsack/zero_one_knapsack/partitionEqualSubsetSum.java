package Dynamic_Programming.TwoD_Dp.knapsack.zero_one_knapsack;

import java.util.*;

public class partitionEqualSubsetSum {
    // memoization
    /*
    public static boolean subset(int i, int[] nums, int tar, int[][] dp) {
        if (i == nums.length) return tar == 0;
        if (dp[i][tar] != -1) return dp[i][tar] == 1;
        var ans = false;
        boolean skip = subset(i + 1, nums, tar, dp);
        if (nums[i] > tar) ans = skip;
        else {
            boolean pick = subset(i + 1, nums, tar - nums[i], dp);
            ans = pick || skip;
        }
        if (ans) dp[i][tar] = 1;
        else dp[i][tar] = 0;
        return ans;
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int ele : nums) {
            sum += ele;
        }
        if (sum % 2 != 0) return false;
        int target = sum / 2;
        int[][] dp = new int[nums.length][target + 1];
        for (int[] rows : dp) {
            Arrays.fill(rows, -1);
        }
        return subset(0, nums, target, dp);

    }

     */


    // method -> 2 tabulation

    public static boolean subset(int[] nums, int target) {
        int n = nums.length;
        // i=0 to n-1 | target to 0
        int[][] dp = new int[n][target + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int tar = 0; tar < dp[0].length; tar++) {
                boolean ans = false;
                boolean skip = false;
                if (i - 1 >= 0) skip = dp[i - 1][tar] == 1;
                else if (tar == 0) skip = true;
                // only valid for +ve numbers
                if (tar - nums[i] < 0) ans = skip;
                else {
                    boolean pick = false;
                    if (i - 1 >= 0) pick = dp[i - 1][tar - nums[i]] == 1;
                    else if (tar == 0) pick = true;
                    ans = pick || skip;
                }
                dp[i][tar] = ans ? 1 : 0;
            }
        }
        return dp[n - 1][target] == 1;
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int ele : nums) {
            sum += ele;
        }
        if (sum % 2 != 0) return false;
        int target = sum / 2;
        return subset(nums, target);

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(canPartition(nums));

    }
}
