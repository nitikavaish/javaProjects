package patternPrinting;

import java.util.Scanner;

public class pascalsTriangle {
    public static int calculateFactorial(int x) {

        return x != 0 && x != 1 ? x * calculateFactorial(x - 1) : 1;
    }

    public static int combination(int n, int r) {
        int nCr = calculateFactorial(n) / (calculateFactorial(r) * calculateFactorial(n - r));
        return nCr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; ++i) {
            for (int sp = 1; sp <= n - i; ++sp) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; ++j) {
                int iCj = combination(i, j);
                System.out.print(iCj + " ");
            }

            System.out.println();
        }
    }
}
