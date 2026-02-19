package LinkedList.SinglyLinkedList;

public class LL {

    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    //    add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    // nthLevel
    public void printList() {
        if (head == null) {
            System.out.println("List is empty. ");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }
        size--;
        head = head.next;

    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;

        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;


    }

    public int getSize() {
        return size;
    }

    public void reverseList() {

        if (head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prev;

            // update
            prev = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prev;
    }

    // reverse recursively

    public Node reverseListRecursion(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseListRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(2);
        list.addLast(3);
        list.addFirst(1);
        list.addLast(4);
        list.printList();
//        list.deleteLast();
//        list.printList();
//        list.deleteFirst();
//        list.printList();
//        System.out.println(list.getSize());
//        list.reverseList();
//        list.printList();
        list.head = list.reverseListRecursion(list.head);
        list.printList();


    }
}
