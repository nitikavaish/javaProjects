package Recursion;

import java.util.Scanner;

public class factorial {
    public static int printFactorial(int n) {
        return n != 1 && n != 0 ? n * printFactorial(n - 1) : 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int fact = printFactorial(n);
        System.out.println(fact);
    }
}
