package SlidingWindowAndTwoPointer;

import java.util.*;

public class numOfSSContaining3Char {
    public static int findNumOfSS(String s) {
        int lastSeen[] = {-1, -1, -1};
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            lastSeen[s.charAt(i) - 'a'] = i;
            if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
                cnt = cnt + 1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "bbacba";
        System.out.println(findNumOfSS(s));

    }
}
