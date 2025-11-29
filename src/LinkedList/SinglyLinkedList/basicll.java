package LinkedList.SinglyLinkedList;

public class basicll {

    public static class Node {
        int data;
        Node next;

        Node(int data) { // constructor
            this.data = data;
        }

        // print recursively

    }

    public static void displayRecursion(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayRecursion(head.next);
    }

    public static void displayReverse(Node head) {
        if (head == null) return;
        displayReverse(head.next);
        System.out.print(head.data + " ");

    }

    public static int countLength(Node head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }

    public static void insertAtEnd(Node head, int val) {
        Node temp = new Node(val);
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next=temp;
        temp.next=null;
    }


    public static void main(String[] args) {
        Node a = new Node(5);
//        System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3 9 8 16
        a.next = b;// 5-> 3 9 8 16
        b.next = c;// 5-> 3-> 9 8 16
        c.next = d;// 5-> 3-> 9-> 8 16
        d.next = e;// 5-> 3-> 9-> 8-> 16
//        System.out.println(a.data);
//        System.out.println(a.next);
//        System.out.println(b.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

//        Node temp = a; // temp a ka hi kaam karega
//        for(int i=0;i<5;i++ ){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//
//        }
        // do bar isliye nhi print hui kyuki head null bn chuka hai


        // display recursively
//        displayRecursion(a);
//        System.out.println();
//        displayReverse(a);
//        System.out.println();
//        System.out.println("length of list is " + countLength(a) + ".");
        insertAtEnd(a, 87);
        displayRecursion(a);

    }
}
