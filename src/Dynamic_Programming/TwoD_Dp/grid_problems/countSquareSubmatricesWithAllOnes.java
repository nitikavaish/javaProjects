package Dynamic_Programming.TwoD_Dp.grid_problems;

public class countSquareSubmatricesWithAllOnes {
    public static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static int countSquares(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] += min(matrix[i - 1][j], matrix[i][j - 1], matrix[i - 1][j - 1]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}};
        System.out.println(countSquares(matrix));

    }
}
