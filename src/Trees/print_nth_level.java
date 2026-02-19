package Trees;

public class print_nth_level {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {

            this.data = data;
        }
    }

    public static int height(Node root) {
        if ((root == null) || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));

    }

    public static void nthLevel(Node root, int n) {
        if (root == null) return;
        if (n == 1) {
            System.out.print(root.data + " ");
            return;
        }
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node f = new Node(6);
        Node e = new Node(7);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
//        nthLevel(root, 3);

        int lev = height(root) + 1;
        // print all levels
        for (int i = 1; i <= lev; i++) {
            nthLevel(root, i);
            System.out.println();
        }
    }
}
