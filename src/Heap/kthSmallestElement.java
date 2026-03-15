package Heap;

import java.util.*;

public class kthSmallestElement {
    public static int kthSmallest(int[] arr, int k) {
        // Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : arr) {
            pq.add(ele);
            if (pq.size() > k) {
                pq.poll();
            }

        }
        return pq.peek();

    }

    public static void main(String[] args) {
        int arr[] = {7, 4,  20, 15, 8, 9};
        int k = 3;
        int ans = kthSmallest(arr, k);
        System.out.println(ans);
    }
}
