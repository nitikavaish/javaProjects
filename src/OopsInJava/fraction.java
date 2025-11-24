package OopsInJava;

public class fraction {
    public static Fraction addFraction(Fraction f1, Fraction f2) {
        int nr = (f1.nr * f2.dr) + (f1.dr * f2.nr);
        int dr = f1.dr * f2.dr;
        Fraction f3 = new Fraction(nr, dr);
        return f3;

    }

    public static Fraction mulFraction(Fraction f1, Fraction f2) {
        int nr = f1.nr * f2.nr;
        int dr = f1.dr * f2.dr;
        Fraction f4 = new Fraction(nr, dr);
        return f4;

    }

    public static Fraction substraction(Fraction f1, Fraction f2) {
        int nr = (f1.nr * f2.dr) - (f1.dr * f2.nr);
        int dr = f1.dr * f2.dr;
        Fraction f5 = new Fraction(nr, dr);
        return f5;

    }

    public static int gcd(int nr, int dr) {
        if (nr < 0) {
            nr = nr * (-1);
        }

        int hcf = 1;
        for (int i = Math.min(nr, dr); i >= 1; i--) {
            if (nr % i == 0 && dr % i == 0) {
                hcf = i;
                break;
            }
        }
        return hcf;
    }

    public static class Fraction {
        int nr;
        int dr;

        public Fraction(int nr, int dr) {
            this.nr = nr;
            this.dr = dr;
            simplify();
        }

        public void simplify() {
            int hcf = gcd(nr, dr);
            nr = nr / hcf;
            dr = dr / hcf;
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(7, 21);
        System.out.println("f1 = " + f1.nr + "/" + f1.dr);

        Fraction f2 = new Fraction(14, 21);
        System.out.println("f2 = " + f2.nr + "/" + f2.dr);

        Fraction f3 = addFraction(f1, f2);
        System.out.println("add =" + f3.nr + "/" + f3.dr);
        Fraction f4 = mulFraction(f1, f2);
        System.out.println("mul =" + f4.nr + "/" + f4.dr);
        Fraction f5 = substraction(f1, f2);
        System.out.println("sub =" + f5.nr + "/" + f5.dr);
//        f1.simplify();
//        System.out.println(f1.nr + "/" + f1.dr);
//        f2.simplify();
//        System.out.println(f2.nr + "/" + f2.dr);


    }
}
