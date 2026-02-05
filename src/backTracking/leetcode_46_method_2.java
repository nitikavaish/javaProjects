package backTracking;

import java.util.*;

public class leetcode_46_method_2 {

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void helper(int nums[], int idx, List<List<Integer>> ans) {
        int n = nums.length;
        if (idx == n - 1) {
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(nums[i]);
            }
            ans.add(l);
            return;
        }
        for (int i = idx; i < n; i++) {
            swap(nums, i, idx);
            helper(nums, idx + 1, ans);
            swap(nums, i, idx);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> ans = permute(arr);
        System.out.println(ans);
    }
}
