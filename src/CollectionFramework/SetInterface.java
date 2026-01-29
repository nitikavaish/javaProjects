package CollectionFramework;

import java.util.*;

public class SetInterface {
    public static void HashSet() {
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(52);
        st.add(66);
        System.out.println(st);
        st.add(3);
        st.add(4);
        st.add(5);
        st.add(6);
        System.out.println(st);
        st.remove(2);
        System.out.println(st);
        System.out.println(st.contains(3));
        System.out.println(st.size());


    }

    public static void LinkedHashSet() {
        HashSet<Integer> st = new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(52);
        st.add(66);
        System.out.println(st);
        st.add(3);
        st.add(48);
        st.add(52);
        st.add(66);
        System.out.println(st);
        st.remove(2);
        System.out.println(st);
        System.out.println("contains : " + st.contains(3));
        System.out.println("size : " + st.size());

    }

    public static void TreeSet() {
        TreeSet<Integer> st = new TreeSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(52);
        st.add(66);
        System.out.println(st);
        st.add(3);
        st.add(4);
        st.add(5);
        st.add(6);
        System.out.println(st);
        st.remove(2);
        System.out.println(st);
        System.out.println(st.contains(3));
        System.out.println(st.size());


    }


    public static void main(String[] args) {
//        HashSet();
//        LinkedHashSet();
        TreeSet();
    }
}
