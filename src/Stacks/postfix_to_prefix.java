package Stacks;

import java.util.Stack;

public class postfix_to_prefix {
    public static void main(String[] args) {

        String postfix = "953+4*6/-";
        Stack<String> val = new Stack<>();
        int n = postfix.length();
        for (int i = 0; i <n; i++) {
            char ch = postfix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(ch + "");
            } else {
                String v2 = val.pop();
                String v1 = val.pop();
                char o = ch;
                String ans = o + v1 + v2;
                val.push(ans);

            }
        }
        System.out.println(val.peek());
    }
}
