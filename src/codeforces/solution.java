package codeforces;

import java.util.*;

public class solution {
    public static int firstUniqueEven(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        HashMap<Integer, Integer> dup = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (!mp.containsKey(arr[i]) && !dup.containsKey(arr[i])) {
                    mp.put(arr[i], i);
                } else {
                    dup.put(arr[i], i);
                    mp.remove(arr[i]);
                }
            }

        }
        int min = Integer.MAX_VALUE;
        int val = -1;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (mp.size() > 0 && min > entry.getValue()) {
                min = entry.getValue();
                val = entry.getKey();
            }
        }
        System.out.println(mp);
        return val;
    }

    public static void main(String[] args) {
        int arr[] = {5, 34, 41, 34, 48, 21, 14, 43, 34, 35, 41, 12, 22, 30, 28, 39, 13, 20, 33, 25, 27, 8, 20, 44, 46, 8, 25, 47, 22, 45, 7, 15, 24, 8, 31, 10, 15, 5, 48, 14, 29, 16, 19, 21, 33};
        System.out.println(firstUniqueEven(arr));
    }
}
