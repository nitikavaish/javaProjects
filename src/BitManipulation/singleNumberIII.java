package BitManipulation;

import java.util.*;

public class singleNumberIII {
    public static void main(String[] args) {
        int arr[] = {3, 4, 3, 2, 4, 7, 8, 9, 2, 8};
        int xor = 0;
        for (int ele : arr) {
            xor ^= ele;
        }
        // xor =xor of two unique numbers ==> 7&9
        int mask = (xor & (xor - 1)) ^ xor;// rightmost bit mask
        int b1 = 0, b2 = 0;
        for (int ele : arr) {
            if ((ele & mask) != 0) b1 ^= ele;
            else b2 ^= ele;
        }
        int[] ans = {b1, b2};
        for (int ele : ans) {
            System.out.print(ele + " ");
        }


    }
}
