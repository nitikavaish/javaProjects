package Set;

import java.util.*;

public class HashSet_Basics {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("hello");
        st.add("World");
        st.add("hello");
        st.add("World");
        System.out.println(st.size()); //2
        System.out.println(st);//[hello, World]
        System.out.println(st.contains("hello")); //true
        System.out.println(st.contains("World"));// true
        System.out.println(st.contains("Hello"));//false
        st.remove("World");
        System.out.println(st.size());//1
        System.out.println(st);//[hello]

    }
}
