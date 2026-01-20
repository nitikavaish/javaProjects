package Stacks;

import java.util.*;

public class preFix_Evaluation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        int n = str.length();
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else {
                int v1 = val.pop();
                int v2 = val.pop();
                char o = ch;
                if (o == '+') ans = v1 + v2;
                else if (o == '-') ans = v1 - v2;
                else if (o == '*') ans = v1 * v2;
                else if (o == '/') ans = v1 / v2;
                val.push(ans);
            }
        }
        System.out.println(ans);
    }
}
