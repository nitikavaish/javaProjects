package Trees;

public class sizeMaxSum {

    static int size = 0;

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {

            this.data = data;
        }
    }

    public static void preOrderDisplay(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrderDisplay(root.left);
        preOrderDisplay(root.right);

    }

    public static int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);

    }

    public static int sum(Node root) {
        if (root == null) return 0;
        return root.data + sum(root.left) + sum(root.right);

    }

    public static int max(Node root) {

        if (root == null) return Integer.MIN_VALUE;
        int a = root.data;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b, c));
    }

    public static int height(Node root) {
        if ((root == null) || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));

    }

    public static void inOrderDisplay(Node root) {
        if (root == null) return;
        inOrderDisplay(root.left);
        System.out.print(root.data + " ");
        inOrderDisplay(root.right);

    }

    public static void postOrderDisplay(Node root) {
        if (root == null) return;
        postOrderDisplay(root.left);
        postOrderDisplay(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node f = new Node(11);
//        Node e = new Node(7);
        b.right = f;
//        b.left = e;

        System.out.println("preorder display");
        preOrderDisplay(root);

        System.out.println();
        System.out.println("size : " + size(root));
        System.out.println("sum : " + sum(root));
        System.out.println("max : " + max(root));
        System.out.println("height : " + height(root));

        System.out.println("inorder display");
        inOrderDisplay(root);
        System.out.println();
        System.out.println("postorder display");
        postOrderDisplay(root);

    }
}
