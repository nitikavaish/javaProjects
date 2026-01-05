package Stacks.InterviewQuestions;

import java.util.*;

public class balenceBrackets {
    // check whether a given bracket is balanced or not
    public static boolean checkBalence(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push('(');
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean check = checkBalence(s);
        System.out.println(check);
    }
}
