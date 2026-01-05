package Stacks;

public class arrayImplementation {
    public static class Stack {
        private int arr[] = new int[50];
        private int idx = 0;

        void push(int x) {
            if(isFull()){
                System.out.println("Stack is full");
                return ;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is empty ");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stack is empty");
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        int size() {
            int size = idx;
            return size;
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        boolean isEmpty() {
            if (size() == 0) return true;
            else return false;
        }
        boolean isFull(){
            if(size()==arr.length) return true;
            else return false ;
        }
        int capacity(){
            return arr.length;
        }


    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();
        System.out.println("size is " + st.size());
        st.pop();
        st.display();
        System.out.println("size is " + st.size());
        st.push(4);
        st.push(3);
        st.push(1);
        st.display();
        st.push(100);
        st.display();
        System.out.println("size is : "+st.size());
        System.out.println(st.capacity());

    }
}
