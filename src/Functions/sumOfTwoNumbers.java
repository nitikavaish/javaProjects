package Functions;

import java.io.PrintStream;
import java.util.Scanner;

public class sumOfTwoNumbers {
    public static int Sum(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        PrintStream var10000 = System.out;
        int var10001 = Sum(a, b);
        var10000.println("sum of two numbers is " + var10001);
    }
}



