package greedyAlgorithm;

public class jumpGame {

    public static boolean checkReachAtEnd(int arr[]) {

        int maxJump = 0, jump = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i>maxJump) return false;
            maxJump = Math.max(maxJump, i+arr[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 1, 1, 0, 2, 5};
        System.out.println(checkReachAtEnd(arr));
    }
}
