package BitManipulation;

import java.util.*;

public class powerOf2 {
    public static boolean isPowerOf2(int n) {

        // method 1  // recursion
//        if (n == 0) return false;
//        if (n == 1) return true;
//        if (n % 2 == 1) return false;
//        return isPowerOf2(n / 2);

        // method 2  // while loop

        if (n == 0) return false;
        while (n > 1) {
            if (n % 2 == 1) return false;
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOf2(n) ? "true" : "false");


    }
}
