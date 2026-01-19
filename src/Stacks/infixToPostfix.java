package Stacks;

import java.util.*;

public class infixToPostfix {

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            // ascii of '0'=48 and '9'=57
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                val.push(s);
            } else if (op.isEmpty() || ch == '(' || op.peek() == '(') op.push(ch);
            else if (ch == ')') {
                while (op.peek() != '(') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String s = v1 + v2 + o;
                    val.push(s);

                }
                op.pop(); // '(' hata diya
            } else {
                if (ch == '+' || ch == '-') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String s = v1 + v2 + o;
                    val.push(s);

                    //push
                    op.push(ch);

                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        //work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String s = v1 + v2 + o;
                        val.push(s);
                        //push
                        op.push(ch);
                    } else op.push(ch);

                }
            }

        }
        // val stack
        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String s = v1 + v2 + o;
            val.push(s);
        }
        System.out.println(val.peek());
    }

}
