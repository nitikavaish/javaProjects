package greedyAlgorithm;

import java.util.*;

public class non_overlapping_intervals {
    public static int find_min_removals(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        int endtime = arr[0][1];
        int cnt = 1;
        // n-meetingOneRoom--> maximize the meeting in one room
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] >= endtime) {
                cnt++;
                endtime = arr[i][1];

            }

        }
        int min_reomval = arr.length - cnt;
        return min_reomval;

    }

    public static void main(String[] args) {
        int arr[][] = {{0, 5}, {3, 4}, {1, 2}, {5, 9}, {5, 7}, {7, 9}};
        int res = find_min_removals(arr);
        System.out.println(res);

    }
}
