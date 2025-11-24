package Loops;

import java.util.Scanner;

public class factorial {
    public static int printFactorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; ++i) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; ++i) {
            System.out.println("factorial of " + i + " is " + printFactorial(i));
        }
    }
}
