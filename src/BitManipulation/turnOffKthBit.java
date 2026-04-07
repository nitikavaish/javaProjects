package BitManipulation;

public class turnOffKthBit {
    public static void main(String[] args) {
        int n = 117;
        int k = 6;
        int a = 1 << k;
        int b = ~a;
        int ans = n & b;
        System.out.println("kth bit is turn off");
    }
}
