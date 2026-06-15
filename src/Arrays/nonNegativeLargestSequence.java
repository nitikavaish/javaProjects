package Arrays;

import java.util.*;

public class nonNegativeLargestSequence {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, -2, -8, -2, -2, 8, 5, -8, -6};
        int sum = 0;
        int cnt = 0;
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
            if (sum < 0) {
                break;
            } else {
                list.add(arr[i]);
                cnt++;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        System.out.println("largest sequence with non negative sum");
        System.out.println(list);
        System.out.println(cnt);


    }
}
