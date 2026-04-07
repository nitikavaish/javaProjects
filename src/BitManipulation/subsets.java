package BitManipulation;

import java.util.*;

public class subsets {
    public static ArrayList<ArrayList<Integer>> printSubsets(int arr[]) {
        int n = arr.length;
        int m = (1 << n); // 2 raised to the power n
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j < 31; j++) {
                if ((i>>j) % 2 != 0) {
                    a.add(arr[j]);
                }
            }
            ans.add(a);

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2,3,4};
        System.out.println(printSubsets(arr));

    }
}