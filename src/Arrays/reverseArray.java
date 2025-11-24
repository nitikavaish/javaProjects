package Arrays;

public class reverseArray {
    public static void swapNumber(int[] number) {
        int first = 0;

        for (int last = number.length - 1; first < last; --last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            ++first;
        }

    }

    public static void main(String[] args) {
        int[] number = new int[]{1, 5, 7, 9, 15, 58, 76, 95};
        swapNumber(number);
        System.out.println("Reverse Array");

        for (int i = 0; i < number.length; ++i) {
            System.out.print(number[i] + " ");
        }
    }
}
