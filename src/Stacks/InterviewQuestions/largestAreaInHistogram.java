package Stacks.InterviewQuestions;

import java.util.Stack;

public class largestAreaInHistogram {
    public static int[] findNextSmaller(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n - 1] = n;
        st.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) res[i] = n;
                //else res[i] = arr[st.peek()];
                // if i need to store index of smaller element
            else res[i] = st.peek();
            st.push(i);
        }
        return res;
    }

    public static int[] findPreviousSmaller(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        res[0] = -1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
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

    public static int findLargestArea(int height[]) {
        int[] nse = findNextSmaller(height);
        int[] pse = findPreviousSmaller(height);

        int maxArea = -1;
        for (int i = 0; i < height.length; i++) {
            int currArea = height[i] * (nse[i] - pse[i] - 1);
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int height[] = {2,1,5,2,3,0,2,1,10,2,3};
        int area = findLargestArea(height);
        System.out.println(area);
    }
}
