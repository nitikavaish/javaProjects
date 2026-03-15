package Heap;

import java.util.*;

public class k_ClosestElements {
    class pair implements Comparable<pair> {
        int key;
        int value;

        public pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(pair o) {
            return Integer.compare(this.key, o.key);
        }
    }

    public static void k_elements(int arr[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

    }

    public static void main(String[] args) {
        int arr[] = {10, 1, 4, 3, 2, 8, 9, 7};
        int ele = 5;
        int k = 5;
    }
}
