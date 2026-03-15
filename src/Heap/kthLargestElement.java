package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargestElement {
    public static int kthLarget(int[] arr, int k) {
        // Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr) {
            pq.add(ele);
            if (pq.size() > k) {
                pq.poll();
            }

        }
        return pq.peek();

    }

    public static void main(String[] args) {
        int arr[] = {7, 4, 20, 15, 8, 9};
        int k = 3;
        int ans = kthLarget(arr, k);
        System.out.println(ans);

    }
}
