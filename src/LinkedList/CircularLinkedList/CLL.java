package LinkedList.CircularLinkedList;

import LinkedList.SinglyLinkedList.basicll;

public class CLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {

        System.out.print(head.data + " ");
        Node temp = head.next;
        while (temp != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }


    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3 9 8 16
        a.next = b;// 5-> 3 9 8 16
        b.next = c;// 5-> 3-> 9 8 16
        c.next = d;// 5-> 3-> 9-> 8 16
        d.next = e;// 5-> 3-> 9-> 8-> 16
        e.next = a;// 5-> 3-> 9-> 8-> 16->5

        display(a);

    }
}
