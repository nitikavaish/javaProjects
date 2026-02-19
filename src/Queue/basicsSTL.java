package Queue;

import java.util.*;

public class basicsSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        // add elements in queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
//        System.out.println(q);
//        System.out.println(q.size());
//        // delete
//        q.poll();
//        System.out.println(q);
//        // delete
//        q.remove();
//        System.out.println(q);
//        // access element
//        System.out.println(q.element());
//        System.out.println(q.peek());

        // preOrderDisplay queue

        while(q.size()>0){
            int top=q.poll();
            System.out.print(top+" ");
            q2.add(top);
        }
        while(q2.size()>0){
            q.add(q2.poll());
        }
        System.out.println();
        System.out.println(q);


    }
}
