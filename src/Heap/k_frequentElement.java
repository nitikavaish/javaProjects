package Heap;

import java.util.*;

public class k_frequentElement {
    static class pair implements Comparable<pair> {
        int key;
        int freq;

        public pair(int key, int value) {
            this.key = key;
            this.freq = value;
        }

        @Override
        public int compareTo(pair o) {
            if (this.freq == o.freq) {
                return this.key - o.key;
            }
            return Integer.compare(this.freq, o.freq);
        }
    }

    public static List<Integer> k_elements(int arr[], int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        //  min heap
        PriorityQueue<pair> pq = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int y = entry.getValue();
            int x = entry.getKey();
            pq.add(new pair(x, y));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            ans.add(pq.poll().key);
        }
        Collections.reverse(ans);
        return ans;


    }

    public static void main(String[] args) {
        int arr[] = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        List<Integer> ans = k_elements(arr, 4);
        System.out.println(ans);


    }
}
