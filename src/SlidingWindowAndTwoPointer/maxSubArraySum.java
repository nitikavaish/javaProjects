package SlidingWindowAndTwoPointer;

public class maxSubArraySum {
    // constant window
    public static int maxSum(int[] arr, int k) {
        int l = 0;
        int r = k - 1;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        while (r < arr.length - 1) {
            maxSum = Math.max(maxSum, sum);
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 2, 3, 3, 4, 5, -1};
        int k = 4;
        System.out.println(maxSum(arr, k));
    }
}
