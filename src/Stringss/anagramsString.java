package Stringss;

import java.beans.PropertyEditorSupport;
import java.util.*;

public class anagramsString {
    public static boolean checkAnagrams(String s, String p) {
        int count[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[p.charAt(i) - 'a']--;
        }
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        if (checkAnagrams(s, p)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

}