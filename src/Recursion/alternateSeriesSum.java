package Recursion;

import java.util.Scanner;

public class alternateSeriesSum {
    // series 1-2+3-4+5-6+7.......
    public static int seriesSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 2 == 0 ? seriesSum(n - 1) - n : seriesSum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSum(n));

    }
}
