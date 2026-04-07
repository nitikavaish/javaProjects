package SlidingWindowAndTwoPointer;

import java.util.HashMap;
import java.util.Map;

public class minWindowSubString {
    public static String minWindowSS(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";
        //frequency map for t
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int l = 0;
        int r = 0;
        int cnt = 0;
        int minLen = Integer.MAX_VALUE;
        int si = -1;// starting index
        while (r < s.length()) {
            char rChar = s.charAt(r);
            if (map.containsKey(rChar)) {
                if (map.get(rChar) > 0) {
                    cnt++;
                }
                map.put(rChar, map.get(rChar) - 1);
            }
            // when we have valid window
            while (cnt == t.length()) {
                // update mim len
                if ((r - l + 1) < minLen) {
                    minLen = r - l + 1;
                    si = l;
                }
                char lChar = s.charAt(l);
                //if char is in t , update map and cnt
                if (map.containsKey(lChar)) {
                    if (map.get(lChar) >= 0) {
                        cnt--;
                    }
                    map.put(lChar, map.get(lChar) + 1);
                }
                l++;
            }
            r++;
        }
        return si == -1 ? "" : s.substring(si, si + minLen);

    }

    public static void main(String[] args) {
        String s = "ddaaabbca";
        String t = "abc";
        String ans = minWindowSS(s, t);
        System.out.println(ans);
    }
}
