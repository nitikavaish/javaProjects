package patternPrinting;

import java.util.Scanner;

public class hollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= 2 * n + 1; ++j) {
                if (j != 1 && j != 2 * n && i != j && i + j != 2 * n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        for (int i = n; i >= 1; --i) {
            for (int j = 1; j <= 2 * n + 1; ++j) {
                if (j != 1 && j != 2 * n && i != j && i + j != 2 * n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
