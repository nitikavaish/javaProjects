package LinkedList.SinglyLinkedList;

public class nthNodeFromEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;

        }
//        System.out.println("size" + size);
        int m = size - n + 1;  // mth node from start = nth node from end
        // mth node from start
        temp = head;
        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // in one traversal

    public static Node nthNodeUsingPointer(Node head, int n) {
        Node slow =head;
        Node fast =head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    // remove nth node from end
    public static Node RemoveNthNodeFromEnd(Node head, int n) {
        Node slow =head;
        Node fast =head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;

    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }




    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 100->13->4->5->12->10->null
        int n=3;
        Node temp = nthNodeUsingPointer(a, n); // i want 3rd node from last
        System.out.println(n+" node from last is "+temp.data);
        a =RemoveNthNodeFromEnd(a,6);
        display(a);


    }
}
