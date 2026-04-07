package BitManipulation;

import java.util.*;

public class XORupToGivenRange {
    public static int XOR(int n) {
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return 2;
        if (n % 4 == 3) return 0;
        if (n % 4 == 4) return n;
        return 1;

    }

    public static int findXOR(int l, int r) {
        return XOR(l - 1) ^ XOR(r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(findXOR(l, r));

    }
}
