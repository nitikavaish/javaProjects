package Queue.Implementation;

public class circularQueueLL_Imple {
    public static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
        }
    }

    public static class Cir_QueueLL {
        Node head;
        Node tail;
        int size = 0;

        void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;


            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head;

            }
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            tail.next = head;
            size--;
            return top;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        void display() {
            if (head == tail) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print(head.data + " ");
            Node temp = head.next;
            while (temp != head) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            if (size == 0) return true;
            else return false;
        }

    }

    public static void main(String[] args) {
        Cir_QueueLL obj = new Cir_QueueLL();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);

        obj.display();
        System.out.println("size : " + obj.size);
        System.out.println("peek : " + obj.peek());
        System.out.println("isEmpty : " + obj.isEmpty());

        obj.remove();
        obj.display();
        System.out.println("size : " + obj.size);
        System.out.println("peek : " + obj.peek());
        System.out.println("isEmpty : " + obj.isEmpty());

        obj.remove();
        obj.display();
        System.out.println("size : " + obj.size);
        System.out.println("peek : " + obj.peek());
        System.out.println("isEmpty : " + obj.isEmpty());

        obj.remove();
        obj.display();
        System.out.println("size : " + obj.size);
        System.out.println("peek : " + obj.peek());
        System.out.println("isEmpty : " + obj.isEmpty());

        obj.remove();
        obj.display();
        System.out.println("size : " + obj.size);
        System.out.println("peek : " + obj.peek());
        System.out.println("isEmpty : " + obj.isEmpty());

        obj.remove();
        obj.display();
        System.out.println("size : " + obj.size);
        System.out.println("peek : " + obj.peek());
        System.out.println("isEmpty : " + obj.isEmpty());


    }

}