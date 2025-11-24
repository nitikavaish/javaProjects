package Arrays;

public class maxSubArraySum {
    public static void maxSum(int[] number) {
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int[] prefix = new int[number.length];
        prefix[0] = number[0];

        for (int i = 1; i < prefix.length; ++i) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        for (int i = 0; i < number.length; ++i) {
            int start = i;

            for (int j = i; j < number.length; ++j) {
                currSum = start == 0 ? prefix[j] : prefix[j] - prefix[start - 1];
                System.out.println(currSum);
                if (maxsum < currSum) {
                    maxsum = currSum;
                }

                currSum = 0;
            }
        }

        System.out.println("max sum is " + maxsum);
    }

    public static void main(String[] args) {
        int[] number = new int[]{2, 4, 6, 8, 10};
        maxSum(number);
    }
}
