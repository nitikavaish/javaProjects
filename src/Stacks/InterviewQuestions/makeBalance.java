package Stacks.InterviewQuestions;

import java.util.*;

public class makeBalance {
    public static int removeExtra(String s) {
        Stack<Character> st = new Stack<>();
        int ex=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push('(');
            } else {
                if (st.isEmpty()) {
                    ex++;
                }else{
                    st.pop();
                }

            }
        }
        if (!st.isEmpty()) {
            ex=ex+st.size();
            return ex;
        }
        return ex;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ex = removeExtra(s);
        System.out.println(ex);
    }
}
