package OopsInJava;

public class Student {
    String name;
    int rno;
    double per;
    final String schoolName = "KPS";
    private static int numOfStudents;

    // default constructor
    public Student() {

    }

    public Student(String name, int rno, double per) {
        this.name = name;
        this.rno = rno;
        this.per = per;
        numOfStudents++;

    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getRno() { // getter
        return rno;
    }

    public static int getNumOfStudents() { // getter
        return numOfStudents;
    }

}
