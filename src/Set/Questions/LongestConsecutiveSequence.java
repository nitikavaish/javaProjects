package Set.Questions;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] arr) {
        HashSet<Integer> st = new HashSet<>();
        for (int num : arr) {
            st.add(num);
        }
        int maxLength = 0;
        for (int num : st)
            if (!st.contains(num - 1)) { // num is st pt
                int currNum = num;
                int currLength = 1;
                while (st.contains(currNum + 1)) {
                    currLength += 1;
                    currNum++;
                }
                maxLength = Math.max(maxLength, currLength);
            }

        return maxLength;

    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(arr));
    }
}