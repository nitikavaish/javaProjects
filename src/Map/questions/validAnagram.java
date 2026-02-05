package Map.questions;

import java.util.HashMap;
import java.util.Map;

public class validAnagram {
    public static HashMap<Character, Integer> freq_map(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (!mp.containsKey(key)) {
                mp.put(key, 1);
            } else {
                int val = mp.get(key) + 1;
                mp.put(key, val);
            }
        }
        return mp;
    }

    // approach 1
    public static boolean checkAnagrams1(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> mp1 = freq_map(s1);
        Map<Character, Integer> mp2 = freq_map(s2);
        if (mp1.equals(mp2)
        ) return true;
        else return false;
    }

    // approach 2
    public static boolean checkAnagrams2(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> mp1 = freq_map(s1);
        for (int i = 0; i < s2.length(); i++) {
            char key = s2.charAt(i);
            if (!mp1.containsKey(key)) return false;
            int currval = mp1.get(key) - 1;
            if (currval == 0) {
                mp1.remove(key);
            } else {
                mp1.put(key, currval);
            }
        }
        // all in map should be 0;
        if (mp1.size() == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s1 = "keeno";
        String s2 = "knee";
        // boolean flag = checkAnagrams1(s1, s2);
        boolean flag = checkAnagrams2(s1, s2);

        System.out.println(flag);
    }
}
