package Queue.InterviewQuestions;

import java.util.*;

public class implementStackUsingQueue {
    public static class MyStack {
        private Queue<Integer> q = new LinkedList<>();

        public MyStack() {

        }

        // 1 2 3 4 5
        public void push(int x) {
            if (q.size() == 0) {
                q.add(x);
            } else {
                q.add(x);
                for (int i = 1; i <= q.size() - 1; i++) {
                    q.add(q.remove());
                }
            }

        }

        public int pop() {

            return q.remove(); // 5
        }

        public int peek() {
            int top = q.peek();

            return top;
        }

        public boolean empty() {
            if (q.isEmpty())
                return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.empty());
    }
}
