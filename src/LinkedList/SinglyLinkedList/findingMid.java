package LinkedList.SinglyLinkedList;

public class findingMid {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node getRightMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node getLeftMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        // 100 -> 13 -> 4 -> 5 -> 12 -> 10
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node Rmid = getRightMid(a);
        System.out.println(Rmid.data);
        Node Lmid = getLeftMid(a);
        System.out.println(Lmid.data);

    }
}
