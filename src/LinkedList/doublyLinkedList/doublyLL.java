package LinkedList.doublyLinkedList;

public class doublyLL {
    public static class Node {
        Node prev;
        int val;
        Node next;


        Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayRev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void displayByRandomNode(Node Random) {
        Node temp = Random;
        // move this temp backwards to the end
        while (temp.prev != null) {
            temp = temp.prev;
        }
        // now temp is at head
        // print the list
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static Node insertAtHead(Node head, int x) {
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        return t;
    }

    public static void insertAtTail(Node head, int x) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;

    }

    public static void insertAt(Node head, int idx, int x) {
        Node temp = head;
        Node t = new Node(x);
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next.prev = t;
        t.prev = temp;
        t.next = temp.next;
        temp.next = t;
    }

    public static Node deleteHead(Node head) {
        head = head.next;
        head.prev = null;
        return head;
    }

    public static void deleteTail(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next = null;

    }

    public static void deleteAt(Node head, int idx) {
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;

    }

    public static void main(String[] args) {
        // 4 -> 10 -> 2 -> 99 -> 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display(a);
        //displayRev(e);
        //displayByRandomNode(c);
        //Node newHead = insertAtHead(a, 35);
        //display(newHead);
        //insertAtTail(a, 30);
        //display(newHead);
        insertAt(a, 3, 50);
        display(a);
        Node newHead = deleteHead(a);
        //deleteAt(a,2);
        //display(newHead);
        deleteTail(a);
        display(a);
    }
}
