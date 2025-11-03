package JavaOops;

import java.util.*;

public class StudentClass {
    public static class Student {
        String name;
        int rno;
        double per;
    }

    public static void print(Student x) {
        System.out.println(x.name);
    }

    public static void change(Student x) {
        x.name = "Mahi";

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nitika";
        s1.per = 94.2;
        s1.rno = 46;
//        System.out.println(s1.name);
        print(s1);
//        s1.name = "Mahi";
        change(s1);
        print(s1);

    }

}
