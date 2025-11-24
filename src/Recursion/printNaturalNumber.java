package Recursion;

import java.util.Scanner;

public class printNaturalNumber {
    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print("1 ");
        } else {
            printIncreasing(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void printDecreasing(int n) {
        if (n == 1) {
            System.out.print("1 ");
        } else {
            System.out.print(n + " ");
            printDecreasing(n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();
        printIncreasing(n);
        System.out.println();
        printDecreasing(n);
    }
}
