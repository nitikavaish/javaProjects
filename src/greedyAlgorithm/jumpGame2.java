package greedyAlgorithm;

public class jumpGame2 {
    public static int minJumpToReachEnd(int arr[], int idx, int jumps) {
        int n = arr.length;
        if (idx >= n - 1) return jumps;
        int mini = Integer.MAX_VALUE;
        for (int i = 1; i <= arr[idx]; i++) {
            mini = Math.min(mini, minJumpToReachEnd(arr, idx + i, jumps + 1));
        }
        return mini;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 1, 4};
        System.out.println(minJumpToReachEnd(arr, 0, 0));
    }
}
