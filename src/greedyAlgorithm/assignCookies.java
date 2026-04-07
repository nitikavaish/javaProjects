package greedyAlgorithm;

import java.util.*;

public class assignCookies {

    public static int maxSatisfiedChildren(int greed[], int s[]) {
        int n = greed.length;
        int m = s.length;
        Arrays.sort(s);
        Arrays.sort(greed);
        int l = 0, r = 0;
        while (l < m) {
            if (s[l] >= greed[r]) {
                r++;
            }
            l++;
        }
        return r;
    }

    public static void main(String[] args) {
        int greed[] = {1, 5, 3, 3, 4};
        int s[] = {4, 2, 1, 2, 1, 3};
        System.out.println(maxSatisfiedChildren(greed, s));
    }
}
