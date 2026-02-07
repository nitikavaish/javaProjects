package backTracking;

public class printAllConfigurationForK_Knights {
    static int maxKnight = 0;
    static int confn = 0;

    public static boolean isSafe(char board[][], int row, int col) {
        int n = board.length;
        int i, j;
        // 2 up 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'k') return false;

        // 2 up 1 right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && board[i][j] == 'k') return false;

        // 2 down 1 left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == 'k') return false;

        // 2 down 1 right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && board[i][j] == 'k') return false;

        // 2 right 1 up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == 'k') return false;

        // 2 right 1 down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == 'k') return false;
        // 2 left 1 up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'k') return false;

        // 2 left 1 down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && board[i][j] == 'k') return false;
        return true;
    }

    public static void placeKnight(char board[][], int row, int col, int num, int k) {
        int n = board.length;
        if (row == n) {
            if (num == k) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
                confn++;
                System.out.println();
            }
            maxKnight = Math.max(maxKnight, num);
            return;

        } else if (isSafe(board, row, col)) {
            board[row][col] = 'k';
            if (col < n - 1) placeKnight(board, row, col + 1, num + 1, k);
            else placeKnight(board, row + 1, 0, num + 1, k);

            // backtracking
            board[row][col] = '.';
        }
        if (col < n - 1) placeKnight(board, row, col + 1, num, k);
        else placeKnight(board, row + 1, 0, num, k);


    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        int k = 8;
        placeKnight(board, 0, 0, 0, k);
        System.out.println("number of configuration  " + confn);
        System.out.println("max night in NxN board are : " + maxKnight);


    }
}
