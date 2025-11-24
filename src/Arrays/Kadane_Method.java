package Arrays;

public class Kadane_Method {
    public static void maxSubarraySum(int[] number) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        System.out.print("current sum = ");

        for (int i = 0; i < number.length; ++i) {
            cs += number[i];
            if (cs < 0) {
                cs = 0;
            }

            System.out.print(cs + " ");
            ms = Math.max(cs, ms);
        }

        System.out.println(" \n max sum of subArray is " + ms);
    }

    public static void main(String[] args) {
        int[] number = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubarraySum(number);
    }
}
