package Trees;

public class implementation {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node root) {
        if (root == null) return;
        System.out.print(root.data + " -> ");
        if (root.left != null) System.out.print(root.left.data + " ,");
        else System.out.print("n ,");
        if (root.right != null) System.out.print(root.right.data);
        else System.out.print("n");
        System.out.println();
        display(root.left);
        display(root.right);


    }

    public static void main(String[] args) {
        Node root = new Node(1);
//      System.out.println(root.data);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
//      Node e = new Node(20);
        Node f = new Node(6);
        b.right = f;
//      System.out.println(b.left.data);
        display(root);


    }
}
