package BinarySearchTree;

import java.util.*;

public class minDistanceTwoBST_Nodes {
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

    static int minDiff = Integer.MAX_VALUE;
    static TreeNode prev = null;

    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (prev != null) {
            int diff = Math.abs(root.val - prev.val);
            minDiff = Math.min(minDiff, diff);
        }
        prev = root;
        inorder(root.right);
    }

    public static int minDiffInBST(TreeNode root) {
        minDiff = Integer.MAX_VALUE;
        prev = null;
        inorder(root);
        return minDiff;
    }

    public static void main(String[] args) {
        String[] arr = {"4", "2", "6", "1", "3"};
        TreeNode root = buildTree(arr);
        prev = null;
        minDiff = Integer.MAX_VALUE;

        System.out.println(minDiffInBST(root));
    }
}
