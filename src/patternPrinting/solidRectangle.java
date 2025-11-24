package patternPrinting;

import java.util.Scanner;

public class solidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter no of columns ");
        int c = sc.nextInt();
        System.out.print("enter no of rows ");
        int r = sc.nextInt();

        for(int i = 0; i < r; ++i) {
            for(int j = 0; j < c; ++j) {
                System.out.print(" *");
            }

            System.out.println();
        }

    }
}
