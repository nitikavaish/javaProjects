package Queue.Implementation;

import java.lang.Exception;

public class circularArrayImplementation {
    public static class circularQueue {
        int arr[] = new int[5];
        int f = 0;
        int r = 0;
        int size = 0;

        public void add(int x) throws Exception {
            if (size == 0) {
                arr[0] = x;
            } else if (size == arr.length) {
                throw new Exception("Queue is full");

            } else if (r < arr.length - 1) {
                arr[++r] = x;

            } else if (r == arr.length - 1) {
                r = 0;
                arr[r] = x;
            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty");
            } else if (f == arr.length - 1) {
                int top = arr[f];
                f = 0;
                size--;
                return top;
            } else {
                int top = arr[f];
                f++;
                size--;
                return top;
            }
        }


        void display() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty");
            } else if (f < r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int i = f; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();

        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty");
            }
            return arr[f];
        }

        boolean isEmpty() {
            if (size == 0) return true;
            else return false;
        }
    }

    public static void main(String[] args) throws Exception {
        circularQueue obj = new circularQueue();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.display();
        System.out.println("size : " + obj.size);
        obj.remove();
        obj.display();
        System.out.println("size : " + obj.size);
        obj.add(1);
        obj.display();
        System.out.println("size : " + obj.size);


    }
}
