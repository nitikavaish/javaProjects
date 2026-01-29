package Queue.InterviewQuestions;

import java.util.*;

public class firstNegativeInEachWindow {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int arr[] = {12, -1, -7, 8, -15, 30, 1, 28};
        int k = 3;
        int n = arr.length;
        int res[] = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }
        for (int i = 0; i < n - k + 1; i++) {
            if (q.size() > 0 && q.peek() < i) q.remove();

            if (q.size() > 0 && q.peek() <= i + k - 1) {
                res[i] = arr[q.peek()];
            } else if (q.size() == 0) res[i] = 0;
            else res[i] = q.peek();

        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }


    }
}
