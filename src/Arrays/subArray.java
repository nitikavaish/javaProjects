package Arrays;

public class subArray {
    public static void printSubArray(int[] numbers) {
        int TSA = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; ++i) {
            for (int j = i; j < numbers.length; ++j) {
                for (int k = i; k <= j; ++k) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }

                System.out.print(" sum of sub array is : " + sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }

                if (minSum > sum) {
                    minSum = sum;
                }

                sum = 0;
                ++TSA;
                System.out.println();
            }

            System.out.println();
        }

        System.out.println(" total numbers of subarrays : " + TSA);
        System.out.println(" max sum of subArray is : " + maxSum);
        System.out.println(" min sum of subArray is : " + minSum);
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 4, 6, 8, 10};
        printSubArray(numbers);
    }
}
