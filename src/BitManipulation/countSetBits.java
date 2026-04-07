package BitManipulation;

public class countSetBits {
    public static int count(int n) {

        // method 1

        int cnt = 0;
        for (int i = 0; i < 31; i++) {
            if ((n >> i) % 2 != 0) {
                cnt++;
            }
        }
        return cnt;


    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(count(n));
    }
}
