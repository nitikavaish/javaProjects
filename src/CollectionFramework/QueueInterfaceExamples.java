package CollectionFramework;

import java.util.*;

public class QueueInterfaceExamples {
    public static void LinkedListExamples() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q); // 1 2 3 4
        System.out.println("poll : " + q.poll()); // 1
        System.out.println(q); // 2 3 4
        System.out.println("peek : " + q.peek()); // 2
        System.out.println("size : " + q.size()); // 3

    }

    public static void PriorityQueueExamples() {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();// min pq
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());// min pq

        pq.offer(10);
        pq.offer(20);
        pq.offer(3);
        pq.offer(40);
        pq.add(5);
        pq.add(6);
        System.out.println(pq);
        System.out.println("peek : " + pq.peek());
        System.out.println("poll : " + pq.poll());
        System.out.println(pq);
        System.out.println("size : " + pq.size());
        System.out.println(pq);
        System.out.println("peek : " + pq.peek());
        System.out.println("poll : " + pq.poll());
        System.out.println(pq);
        System.out.println("size : " + pq.size());
    }

    public static void DequeExamples() {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addLast(1);
        System.out.println(dq);
        System.out.println("peek : " + dq.peek());
        System.out.println("poll : " + dq.poll());
        System.out.println(dq);

    }

    public static void main(String[] args) {
//        LinkedListExamples();
//        PriorityQueueExamples();
        DequeExamples();
    }
}
