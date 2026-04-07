package SlidingWindowAndTwoPointer;

public class longestSubArraySum {
    public static void main(String[] args) {
        //longest subarray with sum <=k
        int arr[] = {2, 5, 1, 10, 10};
        int k = 18;
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxLen = 0;
        int si = -1;
        int ei = -1;
        while (r < arr.length) {
            sum = sum + arr[r];
            while (sum > k) {
                sum = sum - arr[l];
                l++;
            }
            if (sum <= k) {
                if (maxLen < (r - l + 1)) {
                    maxLen = r - l + 1;
                    si = l;
                    ei = r;
                }

            }
            r++;
        }

        System.out.println(maxLen);
//        System.out.println("si " + si + " " + "ei " + ei);
        System.out.println("subarray of max length with sum of subarray <= 18");
        for (int i = si; i <= ei; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
