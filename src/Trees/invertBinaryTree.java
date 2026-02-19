package Trees;

import javax.swing.tree.TreeNode;

public class invertBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void inversion(TreeNode root) {
        if (root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        inversion(root.left);
        inversion(root.right);

    }

    public static void display(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(6);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        display(root);
        System.out.println();
        inversion(root);
        System.out.println("after inversion");
        display(root);

    }
}
