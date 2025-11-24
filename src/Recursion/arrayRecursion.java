package Recursion;

public class arrayRecursion {
    public static void printElement(int[] arr, int idx) {
        if (idx != arr.length) {
            System.out.print(arr[idx] + " ");
            printElement(arr, idx + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        printElement(arr, 0);
    }
}
