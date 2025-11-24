package Recursion;

public class removeOccurences {
    public static String removeAlla(String s, int idx) {
        if (idx == s.length()) {
            return "";
        } else {
            String smallAns = removeAlla(s, idx + 1);
            char currChar = s.charAt(idx);
            return currChar == 'a' ? smallAns : currChar + smallAns;
        }
    }

    public static String removeAlla2(String s) {
        if (s.length() == 0) {
            return "";
        } else {
            String smallAns = removeAlla2(s.substring(1));
            char currChar = s.charAt(0);
            return currChar == 'a' ? smallAns : currChar + smallAns;
        }
    }

    public static void main(String[] args) {

        String s = "abacx";
        System.out.println(removeAlla(s, 0));
        System.out.println(removeAlla2(s));
    }
}
