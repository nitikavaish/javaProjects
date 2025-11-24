package Loops;

import java.util.Scanner;

public class greatestCommonDivisor {
    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int highestCommonFactor(int a, int b) {
        int hcf = 1;

        for (int i = min(a, b); i >= 1; --i) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
                break;
            }
        }

        return hcf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("hcf of " + a + " and " + b + " is " + highestCommonFactor(a, b));

    }
}
