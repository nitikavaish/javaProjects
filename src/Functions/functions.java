package Functions;

import java.util.Scanner;

public class functions {
    public static int calculateProduct(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = calculateProduct(x, y);
        System.out.println("product of two numbers is " + p);
    }
}
