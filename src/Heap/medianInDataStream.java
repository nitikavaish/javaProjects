package Heap;

import java.util.*;

class MedianFinder {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {

    }

    public void addNum(int num) {
        if (maxHeap.size() == 0) {
            maxHeap.add(num);
        } else {
            if (num < maxHeap.peek()) maxHeap.add(num);
            else minHeap.add(num);
        }
        if (maxHeap.size() == minHeap.size() + 2) {
            minHeap.add(maxHeap.poll());
        }
        if (minHeap.size() == maxHeap.size() + 2) {
            maxHeap.add(minHeap.poll());
        }
    }

    // 1 2 3 4 5 6
    public double findMedian() {
        if (minHeap.size() == maxHeap.size() + 1) {
            return minHeap.peek();
        } else if (maxHeap.size() == minHeap.size() + 1) {
            return maxHeap.peek();
        } else if (minHeap.size() == maxHeap.size()) {
            int med = minHeap.peek() + maxHeap.peek();
            return med / 2.0;
        }
        return minHeap.peek();
    }
}

public class medianInDataStream {
    public static void main(String[] args) {
        MedianFinder m = new MedianFinder();
        m.addNum(2);
        m.addNum(3);
        m.addNum(4);
        System.out.println(m.findMedian());
    }
}