package SlidingWindowAndTwoPointer;

public class maxConsecutive {
    public static int maxConsecutiveOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int zero = 0;
        while (r < nums.length) {
            if (nums[r] == 0) zero++;
            if (zero > k) {
                if (nums[l] == 0) zero--;
                l++;
            }
            if (zero <= k) {
                int len = r - l + 1;
                maxLen = Math.max(maxLen, len);
            }
            r++;
        }
        return maxLen;

    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(maxConsecutiveOnes(arr, k));

    }
}
