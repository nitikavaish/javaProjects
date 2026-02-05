package backTracking;

public class Dead_Maze_two_dir {
    public static void printPaths(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == 0) return;
        printPaths(sr, sc + 1, er, ec, s + "R", maze);
        printPaths(sr + 1, sc, er, ec, s + "D", maze);


    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int maze[][] = {{1, 0, 1},
                {1, 1, 1},
                {0, 1, 1}};
        printPaths(0, 0, rows - 1, cols - 1, "", maze);
    }
}
