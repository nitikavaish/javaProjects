package Arrays;

import java.util.Scanner;

public class passingArrayAsArgument {
    public static void update(int[] marks) {
        for (int i = 0; i < marks.length; ++i) {
            int var10002 = marks[i]++;
        }

    }

    public static void main(String[] args) {
        new Scanner(System.in);
        int[] marks = new int[]{97, 98, 99};
        System.out.println("input marks");

        for (int i = 0; i < marks.length; ++i) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();
        update(marks);
        System.out.println("output marks");

        for (int i = 0; i < marks.length; ++i) {
            System.out.print(marks[i] + " ");
        }
    }
}
