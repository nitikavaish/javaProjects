package Map.questions;

import java.util.*;

public class LargestSubArrayWithSumZero {
    public static int largestZeroSumSubArray(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        int prefixSum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (!mp.containsKey(prefixSum)) {
                mp.put(prefixSum, i);
            } else {
                int currLength = Math.abs(mp.get(prefixSum) - i);
                maxLength = Math.max(maxLength, currLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10};
        int res = largestZeroSumSubArray(arr);
        System.out.println(res);
    }
}
