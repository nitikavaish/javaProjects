package LinkedList.SinglyLinkedList;

public class FindIntersection {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static int getSize(Node head) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public static Node getIntersection(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        int m = getSize(head1);
        int n = getSize(head2);
        if (m > n) {
            for (int i = 1; i <= m - n; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 1; i <= n - m; i++) {
                temp2 = temp2.next;
            }
        }
        boolean flag = false;
        for (int i = 1; i <= Math.min(m, n); i++) {
            if (temp1 == temp2) {
                flag = true;
                break;
            } else {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        if (flag == true) {
            return temp1;
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(90);
        Node f = new Node(9);
        Node g = new Node(12);
        Node h = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        e.next = f;
        f.next = d;
        d.next = g;
        g.next = h;
        System.out.println("size of LL1 " + getSize(a));
        System.out.println("size of LL2 " + getSize(e));
        Node common = getIntersection(a, e);
        if (common == null) {
            System.out.println(common);
        } else {
            System.out.println(common.data);
        }
    }
}
