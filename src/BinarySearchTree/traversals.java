package BinarySearchTree;

import java.util.*;

public class traversals {
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

    public static TreeNode buildTree(String[] arr) {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        TreeNode root = new TreeNode(x);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < n - 1) {
            TreeNode temp = q.remove();
            TreeNode left = new TreeNode(10);
            TreeNode right = new TreeNode(100);
            if (arr[i].equals("")) left = null;
            else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if (arr[i + 1].equals("")) right = null;
            else {
                int r = Integer.parseInt(arr[i + 1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;
    }

    public static void display(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " -> ");
        if (root.left != null) System.out.print(root.left.val + " ,");
        else System.out.print("n ,");
        if (root.right != null) System.out.print(root.right.val);
        else System.out.print("n");
        System.out.println();
        display(root.left);
        display(root.right);


    }

    public static void preOrderDisplay(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrderDisplay(root.left);
        preOrderDisplay(root.right);

    }

    public static void postOrderDisplay(TreeNode root) {
        if (root == null) return;
        postOrderDisplay(root.left);
        postOrderDisplay(root.right);
        System.out.print(root.val + " ");

    }

    public static void inOrderDisplay(TreeNode root) {
        if (root == null) return;
        inOrderDisplay(root.left);
        System.out.print(root.val + " ");
        inOrderDisplay(root.right);

    }

    public static void main(String[] args) {
        String[] arr = {"10", "5", "15", "2", "8", "12", "17"};
        TreeNode root = buildTree(arr);
        System.out.println("preOrder:");
        preOrderDisplay(root);
        System.out.println();
        System.out.println("inOrder:");
        inOrderDisplay(root);
        System.out.println();
        System.out.println("postOrder:");
        postOrderDisplay(root);
        System.out.println();
        System.out.println("tree");
        display(root);


    }
}