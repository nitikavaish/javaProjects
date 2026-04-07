package SlidingWindowAndTwoPointer;

import java.util.*;

public class LongestRepeatingCharReplacement {
    public static int longestSS(String s, int k) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int hash[] = new int[26];
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int maxFreq = 0;
        while (r < n) {
            hash[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(r) - 'A']);
            if ((r - l + 1) - maxFreq > k) {
                hash[s.charAt(l) - 'A']--;
//                no need to decrease freq
//                maxFreq = 0;
//                for (int i = 0; i < 26; i++) {
//                    maxFreq = Math.max(maxFreq, hash[i]);
//                }
                l++;
            }
            if ((r - l + 1) - maxFreq <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 2;
        System.out.println(longestSS(s, k));

    }
}
