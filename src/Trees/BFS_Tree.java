package Trees;


import java.util.*;

public class BFS_Tree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void BFS(Node root) { // iterative
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);
        while (q.size() > 0) {
            Node temp = q.peek();
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
            System.out.print(temp.data + " ");
            q.remove();
        }
        System.out.println();
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
        BFS(root);
    }
}
