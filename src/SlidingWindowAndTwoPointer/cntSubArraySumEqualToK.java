package SlidingWindowAndTwoPointer;

public class cntSubArraySumEqualToK {
    public static int cntSubArrays(int[] arr, int k) {
        if (k < 0) return 0;
        int l = 0;
        int r = 0;
        int cnt = 0;
        int sum = 0;
        int n = arr.length;
        while (r < n) {
            sum += arr[r];
            while (sum > k) {
                sum = sum - arr[l];
                l++;
            }
            cnt += r - l + 1;
            r++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        //  only binary arrays are given
        int arr[] = {1, 0, 0, 1, 1, 0};
        int k = 2;
        int res1 = cntSubArrays(arr, k);
        int res2 = cntSubArrays(arr, k - 1);
        int ans = res1 - res2;
        System.out.println(ans);
    }
}
