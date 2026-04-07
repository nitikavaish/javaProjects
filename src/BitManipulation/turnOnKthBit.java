package BitManipulation;

import java.util.*;

public class turnOnKthBit {
    public static void main(String[] args) {

        // concept of create a bit-mask
        int n = 500;
        int a = 1 << 3; // left shift
        int ans = n | a;
        System.out.println("kth bit is on");

    }
}
