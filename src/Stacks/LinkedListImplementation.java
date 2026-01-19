package Stacks;

public class LinkedListImplementation {

    public static class Node {
        int val;
        Node next;

        Node(int data) {
            this.val = data;
        }
    }

    public static class LLStack { // USER defined data structure
        private Node head = null;

        private int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;


        }

        int size() {
            return size;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty ");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        void displayRec(Node h) {
            if (h == null) {
                return;
            }
            displayRec(h.next);
            System.out.print(h.val + " ");
        }

        void display() {
            displayRec(head);
            System.out.println();
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty ");
                return -1;
            }
            int x = head.val;
            return x;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4); // 4
        st.push(5); // 4 5
        st.push(1);// 4 5 1
        st.display(); // 4 5 1
        System.out.println("size is " + st.size());
        st.pop();// 4 5
        st.display(); // 4 5
        System.out.println("size is " + st.size());
        st.push(4); // 4 5 4
        st.push(3); // 4 5 4 3
        st.push(1); // 4 5 4 3 1
        st.display();
        st.push(100); // 4 5 4 3 1 100
        st.display();
        System.out.println("size is : " + st.size());

    }
}
