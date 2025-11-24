package Stringss;

import java.util.*;

public class lexicographically {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 1; i <= s.length() - k; i++) {
            String cr = s.substring(i, (i + k));
            if (cr.compareTo(smallest) < 0) {
                smallest = cr;
            }
            if (cr.compareTo(largest) > 0) {
                largest = cr;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
