package BinarySearchTree;

import java.util.*;

public class InorderPredAndSuccMethod_2 {
    static TreeNode temp = null;
    static int pred = -1;
    static int succ = -1;
    static boolean flag = false;

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

    public static void inorder(TreeNode root, int key) {
        if (root == null) return;
        inorder(root.left, key);
        if (root == null) temp = root;
        else {
            if (root.val == key) {
                pred = temp.val;
                flag = true;
            } else if (root.val != key && flag == true) {
                succ = root.val;
                flag = false;
            } else {
                temp = root;
            }
        }

        inorder(root.right, key);
    }

    public static void main(String[] args) {
        String[] arr = {"50", "30", "70", "20", "40", "60", "80"};
        TreeNode root = buildTree(arr);
        inorder(root, 60);
        System.out.println("pred = " + pred);
        System.out.println("succ = " + succ);
    }
}
