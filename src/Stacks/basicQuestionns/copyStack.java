package Stacks.basicQuestionns;

import java.util.*;

public class copyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the size of stack");
        int n = sc.nextInt();
        System.out.println("Enter the elements ");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }

        System.out.println("original stack "+st);
        // reverse order
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            rt.push(x);
            st.pop();

        }

        Stack<Integer> ct = new Stack<>();
        while (rt.size() > 0) {
            int x = rt.peek();
            ct.push(x);
            rt.pop();

        }
        System.out.println("copy stack " + ct);

    }
}
