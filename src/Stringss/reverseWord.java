package Stringss;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class reverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        String ans="";
        StringBuilder csb=new StringBuilder("");
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch!=' '){
                csb.append(ch);
            }else{
                csb.reverse();
                ans+=csb+" ";
                csb=new StringBuilder("");
            }
        }
        csb.reverse();
        ans+=csb;
        System.out.println(ans);

    }
}