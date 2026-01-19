package Stacks.InterviewQuestions;

import java.util.*;

public class minStackImplementation {

    // approach - 1 using min Stack

//    public static class minStack {
//        Stack<Integer> st = new Stack<>();
//        Stack<Integer> min = new Stack<>();
//
//        void push(int val) {
//            if (st.size() == 0) {
//                st.push(val);
//                min.push(val);
//
//            } else {
//                st.push(val);
//                if (val > min.peek()) min.push(min.peek());
//                else min.push(val);
//            }
//        }
//
//        void pop() {
//            if (st.isEmpty() || min.isEmpty()) {
//                return;
//            }
//            st.pop();
//            min.pop();
//        }
//
//        int top() {
//            if (st.isEmpty()) return -1;
//            return st.peek();
//        }
//
//        int getMin() {
//            if (min.isEmpty()) return -1;
//            return min.peek();
//        }
//    }


    // approach 2 using only min variable


    public static class minStack {
        Stack<Long> st = new Stack<>();
        long min = 0;

        public minStack() {
            // constructor
        }

        void push(int val) {
            long x = (long) val;
            if (st.isEmpty()) {
                st.push(x);
                min = x;
            } else if (x < min) {

                st.push(2 * val - min);
                min = x;
            } else {
                st.push(x);
            }
        }

        void pop() {
            if (st.isEmpty()) return;
            else if (st.peek() < min) {  // fake value hai --> yh par min change hua hai
                // restore the old min;
                long oldMin = 2 * min - st.peek();
                min = oldMin;
                st.pop();
            } else {
                st.pop();
            }

        }

        long top() {
            if (st.isEmpty()) return -1;
            else if (st.peek() < min) {
                return min;  // jo actual value thi wo min par thi
            } else {
                return st.peek();
            }
        }

        long getMin() {
            if (st.isEmpty()) return -1;
            return min;
        }

    }

    public static void main(String[] args) {
        minStack minst = new minStack();
//        minst.push(7);
//        minst.push(8);
//        minst.push(5);
//        minst.push(6);
//        minst.push(3);
//        minst.push(4);
        minst.push(2);
        minst.push(0);
        minst.push(3);
        minst.push(0);


        System.out.println(minst.getMin());
        minst.pop();
        System.out.println(minst.getMin());
        minst.pop();
        System.out.println(minst.getMin());
        minst.pop();
        System.out.println(minst.getMin());
//        minst.pop();
//        System.out.println(minst.getMin());
    }
}
