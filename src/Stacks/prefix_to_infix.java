package Stacks;

import java.util.Stack;

public class prefix_to_infix {
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
        String prefix = "-9/*+5346";
        int n = prefix.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(ch + "");
            } else {
                String v1 = val.pop();
                String v2 = val.pop();
                char o = ch;
                String ans = "(" + v1 + o + v2 + ")";
                val.push(ans);
            }
        }
        System.out.println(val.peek());
    }
}
