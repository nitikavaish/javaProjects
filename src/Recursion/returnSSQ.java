package Recursion;

import java.util.Scanner;

public class returnSSQ {
    public static void printSSQ(String s, String currAns) {
        if (s.length() == 0) {
            System.out.print(currAns + " ");
        } else {
            char curr = s.charAt(0);
            String remString = s.substring(1);
            printSSQ(remString, currAns + curr);
            printSSQ(remString, currAns);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSSQ(s, "");
    }
}
