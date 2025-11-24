package Stringss;

import java.util.*;

public class countConsecutiveDuplicates {
    public static void main(String[] args) {
        String s = "aaabbbbccddde";
        int cnt = 1;
        String ans = "";
        for (int i = 1; i < s.length(); i++) {
            char prev = s.charAt(i - 1);
            char curr = s.charAt(i);

            if (prev == curr) {
                cnt++;
            } else {
                ans += prev + String.valueOf(cnt); // int ko string me convert karne ke liye

                cnt = 1;
            }
        }
        ans+=s.charAt(s.length()-1)+ String.valueOf(cnt);
        System.out.println(ans);
    }
}
