package greedyAlgorithm;

import java.util.*;

public class shortestJobFirst {
    public static int solution(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int t = 0;
        int wt = 0;

        for (int i = 0; i < arr.length; i++) {
            wt += t;
            t += arr[i];

        }
//        System.out.println("wait time " + wt);
        int ans = wt / n;
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 1, 2};
        System.out.println(solution(arr));

    }
}
