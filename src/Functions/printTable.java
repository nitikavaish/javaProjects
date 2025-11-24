package Functions;

import java.util.Scanner;

public class printTable {
    public static void printtable(int n) {
        for (int i = 1; i <= 10; ++i) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        printtable(n);
    }
}
