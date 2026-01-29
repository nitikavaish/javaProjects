package CollectionFramework;

import java.util.*;

public class ListInterfaceExamples {
    public static void ArrayListExamples() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l); // 1 2 3 4
        System.out.println(l.get(1)); // 0-based indexing hoti hai // retrieve 2
        l.set(1, 10);
        System.out.println(l);// 1 10 3 4
        System.out.println(l.contains(10)); // true

    }

    public static void LinkedListExamples() {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(1, 10);
        System.out.println(l);
        System.out.println(l.contains(10));
    }

    public static void StackExamples() {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        System.out.println("pop : " + s.pop());
        System.out.println(s);
        System.out.println("peek : " + s.peek());
        System.out.println(s.isEmpty());
        System.out.println("size : " + s.size());

    }


    public static void main(String[] args) {
//        ArrayListExamples();
//        LinkedListExamples();
        StackExamples();
    }
}
