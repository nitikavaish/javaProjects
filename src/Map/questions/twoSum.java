package Map.questions;

import java.util.*;

public class twoSum {

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int ans[] = {-1};
        for (int i = 0; i < arr.length; i++) {
            int req_target = target - arr[i];
            if (!mp.containsKey(req_target)) {
                mp.put(arr[i], i);
            } else {
                int idx = mp.get(req_target);
                ans = new int[]{i, idx};
                return ans;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {3, 3};
        int target = 6;
        int res[] = twoSum(arr, target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
