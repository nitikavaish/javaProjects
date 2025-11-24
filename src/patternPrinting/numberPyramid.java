package patternPrinting;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i) {
            for(int sp = 1; sp <= n - i; ++sp) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; ++j) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

    }

}
