package Recursion;

import java.util.Scanner;

public class GCD {
    public static int findGCD(int x, int y) {
        return y == 0 ? x : findGCD(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(findGCD(x, y));

    }
}
