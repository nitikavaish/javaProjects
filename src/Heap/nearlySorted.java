package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class nearlySorted {

    public static void k_sortArray(int[] arr, int k) {

        // min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int idx = 0;
        for (int ele : arr) {
            pq.add(ele);
            if (pq.size() > k) {
                int top = pq.poll();
                arr[idx++] = top;
            }
        }
        while (pq.size() > 0) {
            int top = pq.poll();
            arr[idx++] = top;
        }

    }

    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        k_sortArray(arr, k);
        System.out.println();
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
