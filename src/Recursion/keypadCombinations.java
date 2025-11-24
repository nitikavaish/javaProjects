package Recursion;

import java.util.Scanner;

public class keypadCombinations {
    public static void printCombinations(String dig, String[] kp, String res) {
        if (dig.length() == 0) {
            System.out.print(res + " ");
        } else {
            int currNum = dig.charAt(0) - 48;
            String currChoices = kp[currNum];

            for (int i = 0; i < currChoices.length(); i++) {
                printCombinations(dig.substring(1), kp, res + currChoices.charAt(i));
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] kp = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String res = "";
        printCombinations(s, kp, res);
    }
}
