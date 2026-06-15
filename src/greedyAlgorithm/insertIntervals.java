package greedyAlgorithm;

import java.util.*;

public class insertIntervals {
    public static int[][] insertInterval(int[][] interval, int[][] newint) {
        int i = 0;
        ArrayList<int[]> res = new ArrayList<>();

        // left part of the interval
        while (i < interval.length && interval[i][1] < newint[0][0]) {
            res.add(interval[i]);
            i++;
        }
        while (i < interval.length && interval[i][0] <= newint[0][1]) {
            newint[0][0] = Math.min(interval[i][0], newint[0][0]);
            newint[0][1] = Math.max(interval[i][1], newint[0][1]);
            i++;
        }
        res.add(newint[0]);
        while (i < interval.length) {
            res.add(interval[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);

    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 4}, {5, 7}, {8, 10}, {12, 16}};
        int newint[][] = {{6, 8}};
        int[][] res = insertInterval(arr, newint);
        System.out.print("[");
        for (int i = 0; i < res.length; i++) {

            System.out.print(" [" + res[i][0] + " " + res[i][1] + "] ");
        }
        System.out.print("]");
    }

}
