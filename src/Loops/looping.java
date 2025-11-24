package Loops;

import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for table ");
        int t = sc.nextInt();

        for (int i = 1; i <= 10; ++i) {
            System.out.println(t + "x" + i + "=" + t * i);
        }
    }
}
