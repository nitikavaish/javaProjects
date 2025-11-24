package patternPrinting;

import java.util.Scanner;

public class hollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; ++i) {
            for (int k = 1; k <= 2 * n - 1; ++k) {
                if ((i != 1 || k < n) && (i != n || k > n) && i + k != n + 1 && i + k != 2 * n) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
