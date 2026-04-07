package BitManipulation;

public class scoreAfterFlippingMatrix {
    public static int findScore(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] ==0) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] ^= 1;
                    // arr[i][j]=1-arr[i][j];
                }
            }
        }
        // har us col ko flip karo jisme no of 0's >no of 1's
        for (int j = 0; j < m; j++) {
            int zeroes = 0;
            int ones = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 0) zeroes++;
                else ones++;

            }
            if (zeroes > ones) { // flip that col
                for (int i = 0; i < n; i++) {
                    arr[i][j] ^= 1;
                }

            }
        }
        int sum = 0;
        int pow = 1;
        for (int j = m - 1; j >= 0; j--) {
            int ones = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 1) ones++;
            }
            sum += pow * ones;
            pow *= 2;
        }
        return sum;

    }

    public static void main(String[] args) {
        int arr[][] = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        System.out.println(findScore(arr));

    }
}
