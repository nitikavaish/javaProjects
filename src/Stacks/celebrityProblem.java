package Stacks;

import java.util.*;

public class celebrityProblem {
    public static int findCelebrity(int m[][]) {
        int n = m.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int v1 = st.pop();
            int v2 = st.pop();
            if (m[v1][v2] == 0) { // yah v1 celebrity ho sakta but v2 nhi ho sakta hia kyu ki celebrity ko sab jante hai
                st.push(v1);
            } else if (m[v2][v1] == 0) { // yah v2 celebrity ho sakta but v1 nhi ho sakta hia kyu ki celebrity ko sab jante hai
                st.push(v2);
            }
        }
        if (st.isEmpty()) {
            return -1;
        }
        int potential = st.pop();
        for (int j = 0; j < n; j++) {
            if (m[potential][j] == 1) {
                return -1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == potential) {
                continue;
            }
            if (m[i][potential] == 0) {
                return -1;
            }
        }
        return potential;
    }

    public static void main(String[] args) {
        int arr[][] = {{0, 0, 1}, {0, 0, 1}, {0, 0, 0}};
        int celeb = findCelebrity(arr);
        System.out.println(celeb);
    }
}
