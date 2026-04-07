package Heap;

import java.util.*;

public class BST_toMaxHeap {
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

    static int idx;

    public static void inorder(TreeNode root, List<Integer> in) {
        if (root == null) return;
        inorder(root.left, in);
        in.add(root.val);
        inorder(root.right, in);
    }

    public static void postorder(TreeNode root, List<Integer> in) {
        if (root == null) return;
        postorder(root.left, in);
        postorder(root.right, in);
        root.val = in.get(idx++);

    }

    public static void convertToMaxHeap(TreeNode root) {
        idx = 0;
        ArrayList<Integer> in = new ArrayList<>();
        inorder(root, in);
        postorder(root, in);


    }

    public static void print(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        String arr[] = {"4", "2", "6", "1", "3", "5", "7"};
        TreeNode root = buildTree(arr);
        convertToMaxHeap(root);
        print(root);


    }
}
