package Set.Questions;

import java.util.HashSet;

public class maxNumbers {
    public static int maxNumsOnTable(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                max = Math.max(max, set.size());
            } else {
                set.remove(arr[i]);

            }
        }
        return max;
    }

    public static void main(String[] args) {

        int nums[] = {2, 1, 1, 3, 2, 3};
        int size = maxNumsOnTable(nums);
        System.out.println(size);
    }
}
