package Recursion;

public class maxArrayElement {
    public static int printMax(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        } else {
            int smallAns = printMax(arr, idx + 1);
            return Math.max(arr[idx], smallAns);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 17, 8, 9};
        System.out.println(printMax(arr, 0));
    }

}
