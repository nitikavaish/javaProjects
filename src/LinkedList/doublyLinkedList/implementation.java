package LinkedList.doublyLinkedList;

public class implementation {
    public static class Node {
        Node prev;
        int data;
        Node next;


        Node(int data) {
            this.data = data;
        }

    }

    public static class doublyLinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void addAtStart(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head.prev = temp;


        }


    }

    public static void main(String[] args) {

    }
}
