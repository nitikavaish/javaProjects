package Stringss;

import java.util.*;
public class reverseString {
  // using two pointer
    public static void ReverseString(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        String rs = Arrays.toString(arr);
        System.out.println(rs);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // using StringBuilder

//        StringBuilder sb = new StringBuilder(sc.next());
//        sb.reverse();
//        System.out.println(sb);


        // using two pointer
        String s = sc.next();
        ReverseString(s);

    }
}
