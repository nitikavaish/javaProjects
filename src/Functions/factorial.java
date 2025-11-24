package Functions;

import java.util.Scanner;

public class factorial {
    public static int calculateFactorial(int n) {
        int p = 1;

        for (int i = 1; i <= n; ++i) {
            p *= i;
        }

        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = calculateFactorial(n);
        System.out.println("factorial of " + n + " is " + fact);
    }
}
