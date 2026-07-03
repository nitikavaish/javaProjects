package Dynamic_Programming.besics;

import java.util.*;

public class HouseRobber {
    // method ->1 (recursion)
    /*
    public static int Amount(int[] nums, int idx) {
        if (idx >= nums.length) return 0;
        int take = nums[idx] + Amount(nums, idx + 2);
        int skip = Amount(nums, idx + 1);
        return Math.max(take, skip);

    }

    public static int rob(int[] nums) {
        return Amount(nums, 0);
    }

     */

    // method -> 2 (memoization )
    public static int Amount(int[] nums, int idx, int dp[]) {
        if (idx >= nums.length) return 0;
        if (dp[idx] != -1) return dp[idx];
        int take = nums[idx] + Amount(nums, idx + 2, dp);
        int skip = Amount(nums, idx + 1, dp);
        return dp[idx] = Math.max(take, skip);

    }

    public static int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        // idx is varying from 0 to n-1
        return Amount(nums, 0, dp);
    }

    public static void main(String[] args) {
        int arr[] = {5, 15, 6, 20, 22};
        System.out.println(rob(arr));

    }
}
