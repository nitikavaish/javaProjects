package Heap;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int rno;
    double cgpa;

    Student(String name, int rno, double cgpa) {
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;

    }

    @Override
    public int compareTo(Student s) {
        // compare on cgpa basis
        return Double.compare(s.cgpa, this.cgpa);

        // compare on roll no basis
//        return Integer.compare(this.rno, s.rno);

        // on the basis of name
//        return String.CASE_INSENSITIVE_ORDER.compare(this.name, s.name);
//        return this.name.compareTo(s.name);
    }
}

public class CustomComparator {
    public static void main(String[] args) {
        Student s1 = new Student("Gopi", 28, 8.3);
        Student s2 = new Student("Shahid", 49, 8.9);
        Student s3 = new Student("Vikas", 90, 8.5);
        Student s4 = new Student("Isha", 8, 8.3);
        Student s5 = new Student("Nitika", 46, 9.05);
        Student[] arr = {s1, s2, s3, s4, s5};
        System.out.println();
        for (Student student : arr) {
            System.out.println(student.rno + " " + student.name + " " + student.cgpa);
        }
        Arrays.sort(arr);
        System.out.println();
        for (Student student : arr) {
            System.out.println(student.rno + " " + student.name + " " + student.cgpa);
        }
        System.out.println();

    }
}
