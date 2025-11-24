package Recursion;

public class linearSearch {
    public static int searchElement(int[] arr, int idx, int t) {
        if (idx == arr.length) {
            return -1;
        } else {
            return arr[idx] == t ? idx : searchElement(arr, idx + 1, t);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 9};
        int x = 9;
        int i = searchElement(arr, 0, x);
        if (i == -1) {
            System.out.println("element not found");
        } else {
            System.out.println(x + " is present at index " + i);
        }
    }
}
