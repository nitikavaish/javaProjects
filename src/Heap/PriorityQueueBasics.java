package Heap;

import java.util.*;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        // Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(1);
        pq.add(2);
        pq.add(55);
        pq.add(19);
        pq.add(0);
        System.out.println(pq.peek());// min element
        pq.remove();
        System.out.println(pq.peek());
        pq.add(0);
        System.out.println(pq.peek());
        System.out.println(pq.size());
//        System.out.println(pq);
        for (int ele : pq) {
            System.out.print(ele + " ");
        }
    }
}
