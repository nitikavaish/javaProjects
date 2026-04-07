package BitManipulation;

import java.util.*;

public class checkKthBitIsSetOrNot {
    public static void main(String[] args) {
        int n = 500;
        int k = 3;
        // teen baar shift karne per last bit kth bit hogi
        int num = (500) >> 3;
        // agr num even hua to LSB 0 hogi
        if (num % 2 == 0) {
            System.out.println(k + "th bit is not set");
        } else {
            System.out.println(k + "th bit is set");
        }
    }
}
