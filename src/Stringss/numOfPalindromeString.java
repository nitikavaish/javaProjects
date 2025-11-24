package Stringss;

import java.util.*;

public class numOfPalindromeString {
    public static boolean isPalindromic(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;

            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <=s.length(); j++) {
                if (isPalindromic(s.substring(i, j))) {
                    cnt++;
                    System.out.println(s.substring(i, j));
                }
            }
        }
        System.out.println(cnt);

    }
}
