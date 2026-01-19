package Stacks.InterviewQuestions;

import java.util.*;

public class previousSmaller {
    public static int[] findPreviousSmaller(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        res[0] = -1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) res[i] = -1;
                //else res[i]=arr[st.peek()];
                // if we need to store previous smaller element int res
            else res[i] = st.peek();
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 4, 6, 3, 5};
        int res[] = findPreviousSmaller(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
