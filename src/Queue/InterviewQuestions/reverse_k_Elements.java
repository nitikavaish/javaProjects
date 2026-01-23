package Queue.InterviewQuestions;

import java.util.*;

public class reverse_k_Elements {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int k = 4;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        for (int i = 1; i <= k; i++) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        for (int i = 1; i <= q.size() - k; i++) {
            int top = q.remove();
            q.add(top);
        }
        System.out.println(q);
    }
}
