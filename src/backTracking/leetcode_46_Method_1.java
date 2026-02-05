package backTracking;

import java.util.*;

public class leetcode_46_Method_1 {

    public static void helper(int[] nums, List<Integer> ds, boolean[] isValid, List<List<Integer>> ans) {
        if (ds.size() == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < ds.size(); i++) {
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (isValid[i] == false) {// call lagega
                ds.add(nums[i]);
                isValid[i] = true;
                helper(nums, ds, isValid, ans);
                isValid[i] = false;
                ds.remove(ds.size() - 1);

            }
        }

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isValid = new boolean[nums.length];
        helper(nums, ds, isValid, ans);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> ans = permute(arr);
        System.out.println(ans);
    }


}
