package Map.questions;

import java.util.HashMap;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char s_ch = s.charAt(i);
            char t_ch = t.charAt(i);
            if (mp.containsKey(s_ch)) {
                if (mp.get(s_ch) != t_ch) {
                    return false;
                }

                //mp.put(s_ch, t_ch);
            } else {
                if (mp.containsValue(t_ch)) {
                    return false;
                }
                mp.put(s_ch, t_ch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean flag = isIsomorphic("foo", "bar");
        System.out.println(flag);
    }
}
