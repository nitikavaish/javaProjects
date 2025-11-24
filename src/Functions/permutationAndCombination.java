package Functions;

import java.util.Scanner;

public class permutationAndCombination {
    public static int calculateFactorial(int x) {

        return x != 0 && x != 1 ? x * calculateFactorial(x - 1) : 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        int nCr = calculateFactorial(n) / (calculateFactorial(r) * calculateFactorial(n - r));
        System.out.println(nCr);
    }
}
