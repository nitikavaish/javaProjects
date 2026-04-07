package SlidingWindowAndTwoPointer;

import java.util.*;

public class fruitsIntoBasket {
    public static int maxLengthWith2TypesFruits(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int l = 0;
        int r = 0;
        int maxLen = 0;
        while (r < n) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            if (map.size() > k) {
                map.put(arr[l], map.get(arr[l]) - 1);
                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;

    }

    public static void main(String[] args) {
        int arr[] = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        int k = 2;
        System.out.println(maxLengthWith2TypesFruits(arr, k));

    }
}
