package Recursion;

public class arraySum {
    public static int printSum(int[] arr, int idx) {
        return idx == arr.length - 1 ? arr[idx] : arr[idx] + printSum(arr, idx + 1);
    }


    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println(printSum(arr, 0));
    }
}
