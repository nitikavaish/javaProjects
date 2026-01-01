package Stacks.basicQuestionns;

import java.util.*;

public class insertionUsingRec {

    public static void insertAT(Stack<Integer> st, int idx, int val) {
        if (st.size() == idx) {
            st.push(val);
            return;
        }
        // top element ko nikal do
        int top = st.pop();

        // recursive call karo
        insertAT(st, idx, val);
        // top elements ko push kr do
        st.push(top);

    }

    public static void insertATBottom(Stack<Integer> st, int val) {
        if (st.size() == 0) {
            st.push(val);
            return;
        }
        // top element ko nikal do
        int top = st.pop();

        // recursive call karo
        insertATBottom(st, val);
        // top elements ko push kr do
        st.push(top);

    }

    public static void reverseStack(Stack<Integer> st) {
        if (st.size() <= 0) {
            return;
        }
        // top element ko nikal do
        int top = st.pop();
        // recursive call
        reverseStack(st);
        // top element ko bottom me insert karo
        insertATBottom(st, top);

    }

    public static void removeAt(Stack<Integer> st, int idx) {
        if (idx==0) {
            st.pop();
            return;
        }
        // top element ko nikal do
        int top = st.pop();
        // recursive call karo
        removeAt(st, idx-1);
        // top elements ko push kr do
        st.push(top);

    }

    public static void removeAtBottom(Stack<Integer> st) {
        if (st.size() == 1) {
            st.pop();
            return;
        }
        // top element ko nikal do
        int top = st.pop();
        // recursive call karo
        removeAtBottom(st);
        // top elements ko push kr do
        st.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack ");
        int n = sc.nextInt();
        System.out.println("Enter elements ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
//        System.out.println("Before inserting ");
//        System.out.println(st);
//        System.out.println("enter index ");
//        int idx = sc.nextInt();
//        System.out.println("enter value ");
//        int val = sc.nextInt();
//        insertAT(st, idx, val);
//        System.out.println("After inserting ");
//        System.out.println(st);
//        System.out.println("before reverse \n" + st);
//        reverseStack(st);
//        System.out.println(" print reverse stack \n" + st);
        System.out.println("before removing \n" + st);
        removeAt(st, 2);
        //removeAtBottom(st);
        System.out.println("after removing \n" + st);


    }
}
