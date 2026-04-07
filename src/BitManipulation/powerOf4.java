package BitManipulation;

import java.util.*;

public class powerOf4 {
    public static boolean isPowerOfTwo(long n) {
        return (n & (n - 1)) == 0;
    }

    public static boolean isSquare(long n) {
        long root = (long) (Math.sqrt(n));
        return (root * root == n);
    }

    public static boolean isPowerOfFour(long n) {
        return isPowerOfTwo(n) && isSquare(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfFour(n));
    }
}
