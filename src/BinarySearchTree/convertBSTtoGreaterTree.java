package BinarySearchTree;

import java.util.*;

public class convertBSTtoGreaterTree {
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

    static int sum = 0;

    public static void helper(TreeNode root) {
        if (root == null) return;
        helper(root.right);
        root.val = root.val + sum;
        sum = root.val;
        helper(root.left);
    }

    public static TreeNode convertBST(TreeNode root) {
        sum = 0;
        helper(root);
        return root;
    }

    public static void preOrderDisplay(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrderDisplay(root.left);
        preOrderDisplay(root.right);

    }

    public static void main(String[] args) {
        String[] arr = {"4", "1", "6", "0", "2", "5", "7", "", "", "", "3", "", "","", "8"};
        TreeNode root = buildTree(arr);
        TreeNode ans = convertBST(root);
        preOrderDisplay(ans);


    }
}
