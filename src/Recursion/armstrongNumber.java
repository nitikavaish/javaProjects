package Recursion;

import java.util.Scanner;

public class armstrongNumber {
    public static int countDigit(int x) {

        return x == 0 ? 0 : 1 + countDigit(x / 10);
    }

    public static int armstrongSum(int x, int power) {
        int ld = x % 10;
        return x == 0 ? 0 : (int) Math.pow((double) ld, (double) power) + armstrongSum(x / 10, power);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int power = countDigit(x);
        int sum = armstrongSum(x, power);
        if (sum == x) {
            System.out.println(" This is armstrong number");
        } else {
            System.out.println("This is not armstrong number");
        }

    }
}
