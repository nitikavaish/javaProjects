package SlidingWindowAndTwoPointer;

import java.util.*;

public class largestSubstring {
    public static int longestSubstring(String s) {
        int hash[] = new int[255];
        for (int i = 0; i < hash.length; i++) {
            hash[i] = -1;
        }
        int n = s.length();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        while (r < n) {
            if (hash[s.charAt(r)] != -1) {
                if (hash[s.charAt(r)] >= l) {
                    l = hash[s.charAt(r)] + 1;
                }
            }
            int len = r - l + 1;
            maxLen = Math.max(maxLen, len);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "cadbzabcd";
        System.out.println(longestSubstring(s));

    }
}
