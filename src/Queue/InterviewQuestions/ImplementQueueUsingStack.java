package Queue.InterviewQuestions;

import java.util.*;

public class ImplementQueueUsingStack {
    public static class MyQueue {
        private Stack<Integer> st = new Stack<>();
        private Stack<Integer> hs = new Stack<>();

        public MyQueue() {


        }

        // push efficient

        //        public void push(int x) {
//            st.push(x);
//
//        }
//
//        public int peek() {
//            while (st.size() > 1) {
//                hs.push(st.pop());
//            }
//            int top = st.peek();
//            while (hs.size() > 0) {
//                st.push(hs.pop());
//            }
//            return top;
//        }
//
//        public int pop() {
//            while (st.size() > 1) {
//                hs.push(st.pop());
//            }
//            int top = st.pop();
//            while (hs.size() > 0) {
//                st.push(hs.pop());
//            }
//            return top;
//        }
        public void push(int x) {
            if (st.size() == 0) {
                st.push(x);

            } else {
                while (st.size() > 0) {
                    hs.push(st.pop());
                }
                st.push(x);
                while (!hs.isEmpty()) {
                    st.push(hs.pop());
                }
            }
        }

        public int peek() {
            return st.peek();
        }

        public int pop() {
            return st.pop();
        }


        public boolean empty() {
            if (st.size() == 0) {
                return true;
            } else return false;
        }

    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
        q.push(7);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.empty());

    }
}
