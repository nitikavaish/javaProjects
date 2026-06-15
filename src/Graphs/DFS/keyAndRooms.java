package Graphs.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class keyAndRooms {

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean isVis[] = new boolean[n];
        isVis[0] = true;
        dfs(0, rooms, isVis);
        for (boolean ele : isVis) {
            if (ele == false) {
                return false;
            }
        }
        return true;

    }

    private static void dfs(int i, List<List<Integer>> rooms, boolean isVis[]) {
        isVis[i] = true;
        for (int ele : rooms.get(i)) {
            if (!isVis[ele]) {
                dfs(ele, rooms, isVis);
            }
        }

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
        System.out.println(canVisitAllRooms(list));

    }
}
