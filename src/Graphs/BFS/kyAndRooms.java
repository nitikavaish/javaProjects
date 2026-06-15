package Graphs.BFS;

import java.util.*;

public class kyAndRooms {
    public static void bfs(int st, List<List<Integer>> rooms, boolean[] isVis) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(st);
        while (q.size() > 0) {
            int front = q.poll();
            List<Integer> keyList = rooms.get(front);
            for (int ele : keyList) {
                if (!isVis[ele]) {
                    q.offer(ele);
                    isVis[ele] = true;
                }
            }
        }
    }

    public static boolean isVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean isVis[] = new boolean[n];
        isVis[0] = true;// 0th room is open
        bfs(0, rooms, isVis);
        for (boolean ele : isVis) {
            if (!ele) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
        String s = "{{1,3},{3,0,1},{2},{0}}";

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
        System.out.println("input list " + list);
        System.out.println(isVisitAllRooms(list));

    }

}
