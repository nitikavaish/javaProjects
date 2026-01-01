package Stacks;

import java.util.*;

public class basicsOfStacks {


    public static void main(String[] args) {

        //int arr[]=new int[5];
        // ArrayList<Integer> list=new ArrayList<>();

        // DECLARATION OF STACKS
        Stack<Integer> st = new Stack<>();
        System.out.println("stack is empty : " + st.isEmpty());
        // push function
        System.out.println("size is : " + st.size());
        System.out.println(st);
        st.push(1);
        System.out.println("size is : " + st.size());
        System.out.println(st);
        st.push(23);
        System.out.println("size is : " + st.size());
        System.out.println(st);
        st.push(90);
        System.out.println("size is : " + st.size());
        System.out.println(st);
        st.push(5);
        System.out.println("size is : " + st.size());
        System.out.println(st);
        System.out.println("stack is empty : " + st.isEmpty());

        // peek function
//        System.out.println(st.peek()); // sabse upar wala element print kr dega
//        System.out.println(st);
//        st.pop();  // sabse upar wala element delete kr dega
//        System.out.println(st);
//        int size=st.size();
//         System.out.println( "size is : "+st.size());
//        System.out.println(st);

        // access first element using loop
//        while (st.size() > 2) {
//            st.pop();
//
//        }
//        System.out.println(st.peek());
//        System.out.println(st);

    }
}
