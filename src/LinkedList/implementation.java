package LinkedList;

public class implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }


        void insertAtStart(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtStart(val);
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("wrong index");
                return;
            }
            // zero based indexing
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int idx) {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx) {
            if (idx == 0) {
                head = head.next;
                size--;
                return;
            }
            Node temp = head;

            for (int i = 1; i < idx; i++) {
                temp = temp.next;

            }
            temp.next = temp.next.next;
            if (idx == size - 1) {
                temp = tail;
            }

            size--;
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtStart(2);
        ll.insertAtStart(1);
        ll.insertAt(2, 3);
        ll.insertAt(0, 100);
//        ll.insertAt(-1,3);
//        ll.insertAt(8,8);

        ll.display();
        System.out.println();
        System.out.println("size = " + ll.size);
        // 100 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6
        System.out.println("value at index 2 is " + ll.getAt(2));
//        ll.deleteAt(2);
//        ll.deleteAt(6);
        ll.deleteAt(0);
        ll.display();
        System.out.println();
        System.out.println("size = " + ll.size);

    }
}
