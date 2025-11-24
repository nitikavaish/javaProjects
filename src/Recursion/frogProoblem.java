package Recursion;

public class frogProoblem {
    public static int minCost(int[] h, int idx) {
        if (idx == h.length - 1) {
            return 0;
        } else {
            int opt1 = minCost(h, idx + 1) + Math.abs(h[idx + 1] - h[idx]);
            if (idx == h.length - 2) {
                return opt1;
            } else {
                int opt2 = minCost(h, idx + 2) + Math.abs(h[idx + 2] - h[idx]);
                return Math.min(opt1, opt2);
            }
        }
    }

    public static void main(String[] args) {
        int[] h = new int[]{10, 30, 40, 20};
        System.out.println(minCost(h, 0));
    }
}
