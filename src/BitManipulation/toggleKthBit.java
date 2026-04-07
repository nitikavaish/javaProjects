package BitManipulation;

import java.util.*;

public class toggleKthBit {
    public static void main(String[] args) {
        int n = 717;
        int k = 5;
        int bitMask = 1 << k;
        int ans = n ^ bitMask;

        System.out.println("kth bit is toggled");

    }
}
