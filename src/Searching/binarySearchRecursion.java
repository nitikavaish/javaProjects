package Searching;

public class binarySearchRecursion {
    public static boolean searchTarget(int[] arr, int st, int ed, int t) {
        if (st > ed) {
            return false;
        } else {
            int mid = (st + ed) / 2;
            if (t == arr[mid]) {
                return true;
            } else {
                return t > arr[mid] ? searchTarget(arr, mid + 1, ed, t) : searchTarget(arr, st, mid - 1, t);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int t = 7;
        System.out.println(searchTarget(arr, 0, arr.length - 1, t));
    }
}
