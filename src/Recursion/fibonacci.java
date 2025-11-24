package Recursion;

import java.util.Scanner;

public class fibonacci {
    public static int fibonacci(int n) {
        return n != 0 && n != 1 ? fibonacci(n - 1) + fibonacci(n - 2) : n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; ++i) {
            System.out.print(fibonacci(i) + " ");
        }

    }
}
