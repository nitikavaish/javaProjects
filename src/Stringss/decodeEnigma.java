package Stringss;

import java.util.Scanner;

public class decodeEnigma {

//    You own an enigma machine that can interpret a string command. The command consists of strings: "S", "[]" and/or "[sps]" in some order.
//    The enigma will interpret:
//
//            "S" as the string "send"
//            "[]" as the string "the"
//            "[sps]" as the string “ships".
//    You are assigned with the task of parsing this information and getting to know teh masterplan of the allies and take advantage in the war. Each word is separated by a space “ ”.
//    Given the string command, return the enigma’s interpretation of the command.

//    Testcase Input
//    [sps]S[]
//    Testcase Output
//    ships send the

    public static void interpret(String s) {
        s = s.replace("S", "send ");
        s = s.replace("[]", "the ");
        s = s.replace("[sps]", "ships ");
        System.out.println(s.trim());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        interpret(sc.next());
    }
}
