package Stringss;

import java.util.*;

// toggle means
// 1. capital -->small
// 2. small--> capital
public class toggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == ' ') continue;
            ;
            // check small / capital
            int asci = (int) ch;
            if (asci >= 65 && asci <= 90) { // means capital letter
                asci += 32;
                char dh = (char) asci;
                sb.setCharAt(i, dh);

            } else if (asci>=97&&asci<=122){
                asci-=32;
                char eh=(char)asci;
                sb.setCharAt(i,eh);

            }

        }
        System.out.println(sb);
    }
}
