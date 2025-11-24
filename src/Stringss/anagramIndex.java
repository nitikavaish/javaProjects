package Stringss;

import java.util.*;

public class anagramIndex {
    public static ArrayList<Integer> findAnagramIndex(String s, String p) {
        int pCount[] = new int[26];
        int sCount[] = new int[26];
        ArrayList<Integer> result = new ArrayList<>();
        // count array of string p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        // sliding window to count frequency of characters in s
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }
            // compare counts
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagramIndex(s, p));
    }
}
