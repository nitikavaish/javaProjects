package Queue.Implementation;

public class LinkedList_Implementation {

    public static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
        }
    }

    public static class Queue {
        Node head;
        Node tail;
        int size = 0;

        void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;

            } else {
                tail.next = temp;
                tail = temp;

            }
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            if (size == 0) return true;
            else return false;
        }


    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.display();
        System.out.println("size:" + q.size);
        q.remove();
        q.display();
        System.out.println("size:" + q.size);
        System.out.println("peek:" + q.peek());
        System.out.println("isEmpty:" + q.isEmpty());
//        q.remove();
//        q.remove();
//        q.remove();
//        q.remove();
//        q.remove();
//        System.out.println("isEmpty:" + q.isEmpty());
//        System.out.println("peek:" + q.peek());
//        System.out.println("size:" + q.size);
        System.out.println("remove:" + q.remove());
        q.display();
        System.out.println("size:" + q.size);
        System.out.println("isEmpty:" + q.isEmpty());
        System.out.println("peek:" + q.peek());
        q.display();


    }

}