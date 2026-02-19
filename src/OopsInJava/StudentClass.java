package OopsInJava;

public class StudentClass {
//    public static class Student {
//        String name;
//        int rno;
//        double per;

//    }

    public static void print(Student x) {
        System.out.println(x.name);
        System.out.println(x.rno);  // because rno private hai
        System.out.println(x.per);
        System.out.println(x.getNumOfStudents());

    }

//    public static void change(Student x) {
//        x.name = "Mahi";
//
//    }

    public static void main(String[] args) {


//        Student s1 = new Student();
//        s1.name = "Nitika";
//        s1.per = 94.2;
//        s1.rno = 46;
//        System.out.println(s1.name);
//        s1.setRno(46);
//        System.out.println(s1.getRno());
//        nthLevel(s1);
//        s1.name = "Mahi";
//        change(s1);
//        nthLevel(s1);
        Student s1 = new Student("Nitika", 46, 94.2);
        System.out.println(s1.getNumOfStudents());
        Student s2 = new Student("Mahi", 20, 87.5);
        System.out.println(s2.getNumOfStudents());
//        nthLevel(s1);
//        Student s2 = new Student();
//        s2.name = "Mahi";
//        s2.rno = 20;
//        s2.per = 87.5;
//        s2.schoolName="KPS";
//        nthLevel(s2);
//        Student.numOfStudents=100;
        System.out.println(Student.getNumOfStudents());

    }
}
