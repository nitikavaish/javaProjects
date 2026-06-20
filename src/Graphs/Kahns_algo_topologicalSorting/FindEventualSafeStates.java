package Graphs.Kahns_algo_topologicalSorting;

import java.util.*;

public class FindEventualSafeStates {
    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> radj = new ArrayList<>();
        for (int i = 0; i < n; i++) radj.add(new ArrayList<>());
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            for (int ele : graph[i]) {
                // in original graph i->ele
                // in rev graph edge ele->i
                radj.get(ele).add(i);
                indegree[i]++;

            }
        }
        // kahn's algo
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int front = q.poll();
            ans.add(front);
            for (int ele : radj.get(front)) {
                indegree[ele]--;
                if (indegree[ele] == 0) {
                    q.offer(ele);
                }
            }
        }
        Collections.sort(ans);
        return ans;

    }

    public static void main(String[] args) {
        int graph[][] = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        List<Integer> ans = eventualSafeNodes(graph);
        System.out.println(ans);

    }
}
