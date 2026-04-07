package BitManipulation;

public class nthPowerOf2 {
    public static void main(String[] args) {
        // find 2^n in O(1) time
        long n = 32;
        long x = 1;
        long ans = x << n;
        System.out.println(ans);
    }

}
