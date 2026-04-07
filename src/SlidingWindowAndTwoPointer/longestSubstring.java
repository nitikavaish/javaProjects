package SlidingWindowAndTwoPointer;

import java.util.*;

public class longestSubstring {
    static int si = 0;
    static int ei = 0;

    public static int findLongestSubstring(String s, int k) {
        int n = s.length();
        int l = 0;
        int r = 0;
        int maxLen = 0;
//        int si = 0;
//        int ei = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (r < n) {
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.size() > k) {
                char cch = s.charAt(l);
                map.put(cch, map.get(cch) - 1);
                if (map.get(cch) == 0) {
                    map.remove(cch);
                }
                l++;
            }
            int len = r - l + 1;
            if (maxLen < len) {
                maxLen = len;
                si = l;
                ei = r;
            }
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "aaaaaabbbccdddddd";
        int k = 2;
        si = 0;
        ei = 0;
        System.out.println(findLongestSubstring(s, k));
        for (int i = si; i <= ei; i++) {
            System.out.print(s.charAt(i));
        }
    }
}



