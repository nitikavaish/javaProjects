package SlidingWindowAndTwoPointer;

public class niceSubArrays {
    public static int cntNiceSubArrays(int[] arr, int k) {
        if (k < 0) return 0;
        int l = 0;
        int n = arr.length;
        int r = 0;
        int sum = 0;
        int cnt = 0;
        while (r < n) {
            if (arr[r] % 2 != 0) {
                sum++;
            }
            while (sum > k) {
                if (arr[l] % 2 != 0) {
                    sum--;

                }
                l++;
            }
            cnt += r - l + 1;
            r++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 1};
        int k = 3;
        int res1 = cntNiceSubArrays(arr, k);
        int res2 = cntNiceSubArrays(arr, k - 1);
        int ans = res1 - res2;
        System.out.println(ans);

    }
}
