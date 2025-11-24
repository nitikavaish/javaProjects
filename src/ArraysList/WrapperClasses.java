package ArraysList;

import java.util.ArrayList;
import java.util.Optional;

public class WrapperClasses {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(1, 100);
        l1.set(1, 10);
        l1.remove(1);
        boolean res = l1.remove(Optional.of(7));
        boolean ans = l1.contains(6);
        ArrayList l = new ArrayList();
        l.add("hello");
        l.add(10);
        l.add(true);
        System.out.println(l);
    }
}
