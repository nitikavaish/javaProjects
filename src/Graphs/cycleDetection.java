package Graphs;

import java.util.*;


public class cycleDetection {
    static class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static boolean usingDFS(int st, int p, List<List<Integer>> adj, boolean[] isVis) {
        isVis[st] = true;
        for (int child : adj.get(st)) {
            if (!isVis[child]) {
                if (usingDFS(child, st, adj, isVis)) return true;
            } else if (child != p) {
                return true;
            }
        }
        return false;

    }

    public static boolean usingBFS(int st, List<List<Integer>> adj, boolean[] isVis) {
        isVis[st] = true;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(st, -1));
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int ele = p.a;
            int parent = p.b;
            List<Integer> children = adj.get(ele);
            for (int i = 0; i < children.size(); i++) {
                int child = children.get(i);
                if (!isVis[child]) {
                    isVis[child] = true;
                    q.offer(new Pair(child, ele));
                } else if (child != parent) {
                    return true;
                }

            }

        }
        return false;

    }

    private static boolean detectCycle(List<List<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
//                if (usingBFS(i, adj, visited)) {
//                    return true;
//                }
                if (usingDFS(i, -1, adj, visited)) {
                    return true;
                }
            }
        }
        return false;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
        String s = "{{1},{2,0},{1,3,4},{2,4,5},{2,3},{3,6},{5}}";

        List<List<Integer>> list = new ArrayList<>();

        // remove outer braces
        s = s.substring(2, s.length() - 2);

        // split inner groups
        String[] groups = s.split("\\},\\{", -1);

        for (String group : groups) {

            List<Integer> inner = new ArrayList<>();

            if (!group.isEmpty()) {
                String[] nums = group.split(",");

                for (String num : nums) {
                    inner.add(Integer.parseInt(num));
                }
            }

            list.add(inner);
        }
        System.out.println(detectCycle(list));

    }


}
