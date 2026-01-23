package Stacks;

import java.util.*;

public class SlidingWindowMaximum {
    public static int[] findNGE(int arr[]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        res[n - 1] = n;
        st.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = n;
            } else {
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }

    public static int[] maxSlidingWindow(int nums[], int k) {
        int n = nums.length;
        int z = 0;
        // yaha har ek window ka ek maximum hoga but last window me k elements hota hai or usme se
        // ek hi max hoga isiliye k-1 size chot ahai original size se
        // n-(k-1)=n-k+1
        int[] ans = new int[n - k + 1];
        int nge[] = findNGE(nums);
        int j = 0;
        for (int i = 0; i < n - k + 1; i++) {
            if (j >= i + k) j = i;
            int max = nums[j];
            while (j < i + k) {
                max = nums[j];
                j = nge[j];
            }

            ans[z++] = max;

        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7, 6};
        int k = 3;
        int res[] = maxSlidingWindow(arr, k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }


    }
}
