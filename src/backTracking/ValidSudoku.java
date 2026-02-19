package backTracking;

public class ValidSudoku {

    public static boolean isValid(String[][] board, int row, int col, String num) {
        // check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j].equals(num)) return false;
        }
        // check col
        for (int i = 0; i < 9; i++) {
            if (board[i][col].equals(num)) return false;
        }
        // check 3x3 grid
        int sRow = row / 3 * 3;
        int sCol = col / 3 * 3;
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (board[i][j].equals(num)) return false;
            }
        }
        return true;
    }

    public static boolean isValidSudoku(String[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == ".") continue;
                String num = board[i][j];
                board[i][j] = ".";
                if (isValid(board, i, j, num) == false) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String board[][] = {{"5", "3", ".", ".", "7", ".", ".", ".", "."}
                , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
                , {".", "9", "8", ".", ".", ".", ".", "6", "."}
                , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
                , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
                , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
                , {".", "6", ".", ".", ".", ".", "2", "8", "."}
                , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
                , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};

//
//        String board[][] = {
//                {"8", "3", ".", ".", "7", ".", ".", ".", "."}
//                , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
//                , {".", "9", "8", ".", ".", ".", ".", "6", "."}
//                , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
//                , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
//                , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
//                , {".", "6", ".", ".", ".", ".", "2", "8", "."}
//                , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
//                , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};
//
//
        System.out.println(isValidSudoku(board));
    }
}
