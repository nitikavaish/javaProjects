package Recursion;

public class reverseString {
    public static String reverse(String s, int idx) {
        if (idx == s.length()) {
            return "";
        } else {
            String smallAns = reverse(s, idx + 1);
            return smallAns + s.charAt(idx);
        }
    }

    public static String reverse2(String s) {
        if (s.length() == 0) {
            return "";
        } else {
            String smallAns = reverse2(s.substring(1));
            return smallAns + s.charAt(0);
        }
    }

    public static void main(String[] args) {

        String s = "Hello Dear";
        System.out.println(reverse(s, 0));
        System.out.println(reverse2(s));
    }
}
