package Stacks.basicQuestionns;

import java.util.*;

public class displayStack {

    public static void displayRevRec(Stack<Integer> st) {
        if (st.size() == 0) return;
        int top = st.pop();
        System.out.print(top + " ");
        displayRevRec(st);
        st.push(top);
    }

    public static void displayRec(Stack<Integer> st) {
        if (st.size() == 0) return;
        int top = st.pop();
        displayRevRec(st);
        System.out.print(top + " ");
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);

        // preOrderDisplay iterative

//        int n = st.size();
//        int arr[] = new int[n];
//        for (int i = n - 1; i >= 0; i--) {
//            arr[i] = st.pop();
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.nthLevel(arr[i] + " ");
//            st.push(arr[i]);
//        }
//        System.out.println();
//        System.out.println(st);

        // preOrderDisplay Recursively
        System.out.println("preOrderDisplay stack in reverse order ");
        displayRevRec(st);// pass by reference hota hai
        System.out.println("\npreOrderDisplay stack in same order ");
        displayRec(st);
    }
}
