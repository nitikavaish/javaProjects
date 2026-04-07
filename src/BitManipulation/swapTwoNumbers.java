package BitManipulation;

public class swapTwoNumbers {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        System.out.println("before swapping");
        System.out.println("a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after swapping ");
        System.out.println("a = " + a + " b = " + b);
        int x = 5;
        System.out.println("1's complement of x is " + ~x); // 1's complements
        System.out.println("1's complement of x is " + (-x - 1));
        System.out.println("2's complement of x is " + (~x + 1)); // 2's complements
        System.out.println("2's complement of x is " + (-x));// 2's complement


    }
}