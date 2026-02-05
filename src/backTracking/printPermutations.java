package backTracking;

import java.util.*;

public class printPermutations {

    public static void printP(String str, String t, List<List<String>> ans) {
        if (str.equals("")) {
            ans.add(Arrays.asList(t));

            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String rem = left + right;
            printP(rem, t + ch, ans);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        List<List<String>> ans = new ArrayList<>();
        printP(str, "", ans);
        System.out.println(ans);
    }
}
