package Stacks;

import java.util.Stack;

public class Postfix_evaluation {
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        String str = "953+4*6/-";
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            // ascii value of '0'=48 and '9'=57

            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else {
                int v2 = val.pop();
                int v1 = val.pop();
                char o = ch;

                if (o == '+') {
                    ans = v1 + v2;
                } else if (o == '-') {
                    ans = v1 - v2;
                } else if (o == '*') {
                    ans = v1 * v2;
                } else if (o == '/') {
                    ans = v1 / v2;
                }
                val.push(ans);
            }
        }
        System.out.println(ans);
    }
}
