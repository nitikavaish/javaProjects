package BitManipulation;

public class singleNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 4, 3};
        // you can start with 0 because 0 ke sath xor karne pr wo
        // num hi aata hai
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans ^= arr[i];

        }
        System.out.println(ans);
    }
}
