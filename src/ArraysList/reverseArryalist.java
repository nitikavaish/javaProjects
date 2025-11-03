package ArraysList;

import java.util.ArrayList;
import java.util.Collections;

public class reverseArryalist {


    public static void reverseList(ArrayList<Integer> list) {
        int i = 0;

        for (int j = list.size() - 1; i < j; --j) {
            Integer temp = (Integer) list.get(i);
            list.set(i, (Integer) list.get(j));
            list.set(j, temp);
            ++i;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList();
        l.add(0);
        l.add(10);
        l.add(3);
        l.add(5);
        l.add(22);
        l.add(10);
        System.out.println("Oroinal list " + String.valueOf(l));
        Collections.reverse(l);
        System.out.println("reverse list " + String.valueOf(l));
        Collections.sort(l);
        System.out.println("Acending order " + String.valueOf(l));
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("decending order" + String.valueOf(l));
        ArrayList<String> l1 = new ArrayList();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println("original list " + String.valueOf(l1));
        Collections.sort(l1);
        System.out.println("lexicographically order" + String.valueOf(l1));
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("reverse lexicographically order " + String.valueOf(l1));
    }

}

