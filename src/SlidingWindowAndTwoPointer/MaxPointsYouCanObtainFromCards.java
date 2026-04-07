package SlidingWindowAndTwoPointer;

import java.util.*;

public class MaxPointsYouCanObtainFromCards {
    public static int minPoints(int[] arr, int k) {
        int lSum = 0;
        int rSum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            lSum += arr[i];

        }
        maxSum = lSum;
        int rIndex = arr.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            lSum -= arr[i];
            rSum += arr[rIndex];
            rIndex--;
            maxSum = Math.max(maxSum, (lSum + rSum));
        }
        return maxSum;

    }

    public static void main(String[] args) {
        int arr[] = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;
        int ans = minPoints(arr, k);
        System.out.println(ans);
    }
}
