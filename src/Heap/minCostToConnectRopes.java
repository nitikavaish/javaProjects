
// min cost to connect the ropes (GfG)
package Heap;

import java.util.PriorityQueue;
import java.util.*;

public class minCostToConnectRopes {
    public static int minCost(int arr[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost = 0;
        for (int ele : arr) {
            pq.add(ele);
        }
        while (pq.size() > 1) {
            int top1 = pq.poll();
            int top2 = pq.poll();

            int currCost = top1 + top2;
            cost += currCost;
            pq.add(currCost);

        }
        return cost;

    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 6, 9};
        int ans = minCost(arr);
        System.out.println(ans);
    }
}
