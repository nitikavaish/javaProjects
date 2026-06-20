package Graphs.Kahns_algo_topologicalSorting;

import java.util.*;
// Leetcode 210
public class courseSchedule2 {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adj = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] p : prerequisites) {
            adj[p[1]].add(p[0]);
        }
        // kahn's algorithm
        int[] in = new int[adj.length];
        for (int i = 0; i < adj.length; i++) {
            for (int ele : adj[i]) {
                in[ele]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList();
        for (int i = 0; i < numCourses; i++) {
            if (in[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int front = q.poll();
            ans.add(front);
            for (int ele : adj[front]) {
                in[ele]--;
                if (in[ele] == 0) {
                    q.offer(ele);
                }
            }
        }
        if (ans.size() != numCourses) {
            return new int[]{};
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }


    public static void main(String[] args) {
        int arr[][] = {{1, 0}};
        int n = 2;
        int[] res = findOrder(n, arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
