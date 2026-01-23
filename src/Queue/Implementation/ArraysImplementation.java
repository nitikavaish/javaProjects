package Queue.Implementation;

import java.util.*;

public class ArraysImplementation {
    public static class QueueA {
        int arr[] = new int[5];
        int f = 0;
        int r = 0;
        int size=0;

        void add(int n) {
            if (r == arr.length) {
                System.out.println("queue is filled ");
                return;
            }
            arr[r++] = n;
            size++;
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty ");
                return -1;
            }
            int top = arr[f];
            f++;
            size--;
            return top;
        }



        void display() {
            if (isEmpty()) {
                System.out.println("queue is empty ");
                return;
            }
            for (int i = f; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }

        int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty ");
                return -1;
            }
            return arr[f];
        }

        boolean isEmpty() {
            if (size == 0) return true;
            else return false;
        }


    }

    public static void main(String[] args) {
        QueueA q = new QueueA();
        q.add(1);
//        q.display();
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println("size : "+q.size);
        q.remove();
        q.display();
        System.out.println("size : "+q.size);
        System.out.println("peek : "+q.peek());
        System.out.println("isEmpty : "+q.isEmpty());
        q.remove();
        q.display();
        System.out.println("size : "+q.size);
        System.out.println("peek : "+q.peek());
        System.out.println("isEmpty : "+q.isEmpty());
        q.remove();
        q.display();
        System.out.println("size : "+q.size);
        System.out.println("peek : "+q.peek());
        System.out.println("isEmpty : "+q.isEmpty());
        q.remove();
        q.display();
        System.out.println("size : "+q.size);
        System.out.println("peek : "+q.peek());
        System.out.println("isEmpty : "+q.isEmpty());
        q.remove();
        q.display();
        System.out.println("size : "+q.size);
        System.out.println("peek : "+q.peek());
        System.out.println("isEmpty : "+q.isEmpty());




    }
}
