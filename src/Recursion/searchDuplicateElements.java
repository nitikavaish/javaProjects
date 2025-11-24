package Recursion;

public class searchDuplicateElements {
    public static void searchDuplicates(int[] arr, int idx, int t) {
        if (idx != arr.length) {
            if (arr[idx] == t) {
                System.out.print(idx + " ");
            }

            searchDuplicates(arr, idx + 1, t);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 6, 2, 2, 2, 8};
        searchDuplicates(arr, 0, 2);
    }
}
