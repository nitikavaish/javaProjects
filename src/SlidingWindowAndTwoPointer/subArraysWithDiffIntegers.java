package SlidingWindowAndTwoPointer;

import java.util.HashMap;
import java.util.Map;

public class subArraysWithDiffIntegers {
    public static int cntSubArrays(int[] arr, int k) {
        if (k < 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int cnt = 0;
        int n = arr.length;
        while (r < n) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
            while (map.size() > k) {
                map.put(arr[l], map.get(arr[l]) - 1);
                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }
                l++;
            }
            cnt += r - l + 1;
            r++;

        }
        return cnt;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 1, 1, 3, 4, 3, 2};
//        int arr[] = {1, 2, 1, 3, 4};
        int k = 3;
        int res1 = cntSubArrays(arr, k);
        int res2 = cntSubArrays(arr, k - 1);
        int ans = res1 - res2;
//        System.out.println("res1 = " + res1);
//        System.out.println("res2 = " + res2);
        System.out.println(ans);
    }
}
