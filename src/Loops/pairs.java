package Loops;

public class pairs {
    public static void printPairs(int[] number) {
        int count = 0;

        for (int i = 0; i < number.length; ++i) {
            for (int j = i + 1; j < number.length; ++j) {
                ++count;
                System.out.print("(" + number[i] + "," + number[j] + ") ");
            }

            System.out.println();
        }

        System.out.println(" number of total pairs : " + count);
    }

    public static void main(String[] args) {
        int[] number = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printPairs(number);

    }
}
