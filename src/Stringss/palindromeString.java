package Stringss;

import java.util.*;

public class palindromeString {
    public static boolean checkPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        boolean flag = true; //palindrome
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;

            }
            i++;
            j--;
        }
        return flag;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = checkPalindrome(sc.next());
        System.out.println("is palindrome ? ");
        System.out.println(check);


    }
}
