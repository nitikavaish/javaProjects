package backTracking;

public class ratDeadMazeOptimizedFourDir {
    public static void printPaths(int sr, int sc, int er, int ec, String s, int maze[][]) {

        if (sr < 0 || sc < 0) return;
        if (sr > er || sc > ec) return;

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == 0) return;
        if (maze[sr][sc] == -1) return;
        // check
        maze[sr][sc] = -1; // space complexity=O(n)
        // go down
        printPaths(sr + 1, sc, er, ec, s + "D", maze);
        // go right
        printPaths(sr, sc + 1, er, ec, s + "R", maze);
        // go left
        printPaths(sr, sc - 1, er, ec, s + "L", maze);
        // go up
        printPaths(sr - 1, sc, er, ec, s + "U", maze);
        // backtracking
        maze[sr][sc] = 1;

    }

    public static void main(String[] args) {

        int rows = 3;
        int cols = 4;
        int maze[][] = {{1, 0, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 1}};

        printPaths(0, 0, rows - 1, cols - 1, "", maze);


    }
}
