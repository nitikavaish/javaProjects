package Recursion;

import java.util.Scanner;

public class checkPalindromeTwoPointer {
    public static boolean checkPalindrome(String s, int l, int r) {
        if (l == r) {
            return true;
        } else {
            return s.charAt(l) == s.charAt(r) ? checkPalindrome(s, l + 1, r - 1) : false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean check = checkPalindrome(s, 0, s.length() - 1);
        System.out.println(check);
    }
}
