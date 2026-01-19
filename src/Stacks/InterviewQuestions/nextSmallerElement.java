package Stacks.InterviewQuestions;

import java.util.*;

public class nextSmallerElement {

    public static int[] findNextSmaller(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n - 1] = -1;
        st.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) res[i] = -1;
            //else res[i] = arr[st.peek()];
            // if i need to store index of smaller element
            else res[i]=st.peek();
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 4, 6, 3, 5};
        int res[] = findNextSmaller(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
