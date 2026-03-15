package BinarySearchTree;

import java.util.*;

public class deletionOfNodes {
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

    public static void preOrderDisplay(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrderDisplay(root.left);
        preOrderDisplay(root.right);

    }

    // tnode=target node ko hi delete karna hai
    public static void deleteNode(TreeNode root, int target) {
        if (root == null) return;
        if (root.val > target) {
            if (root.left == null) return;// go left
            if (root.left.val == target) {
                TreeNode ltNode = root.left;
                if (ltNode.left == null && ltNode.right == null) root.left = null; // leaf node
                else if (ltNode.left == null || ltNode.right == null) { // 1child
                    if (ltNode.left != null) root.left = ltNode.left;
                    if (ltNode.right != null) root.left = ltNode.right;
                } else { // two child
                    TreeNode c = ltNode;
                    TreeNode pred = c.left;
                    while (pred.right != null) pred = pred.right;
                    deleteNode(root, pred.val);
                    pred.left = c.left;
                    pred.right = c.right;
                    root.left = pred;
                }
            } else deleteNode(root.left, target);
        } else {// go right
            if (root.right == null) return;
            if (root.right.val == target) {
                TreeNode rtNode = root.right;
                if (rtNode.left == null && rtNode.right == null) root.right = null;
                else if (rtNode.left == null || rtNode.right == null) {
                    if (rtNode.left != null) root.right = rtNode.left;
                    if (rtNode.right != null) root.right = rtNode.right;
                } else {
                    TreeNode c = rtNode;
                    TreeNode pred = c.left;
                    while (pred.right != null) pred = pred.right;
                    deleteNode(root, pred.val);
                    pred.left = c.left;
                    pred.right = c.right;
                    root.right = pred;
                }
            } else {
                deleteNode(root.right, target);
            }
        }
    }

    public static TreeNode deleteTreeNode(TreeNode root, int target) {

        TreeNode temp = new TreeNode(Integer.MAX_VALUE);
        temp.left = root;
        deleteNode(temp, target);
        return temp.left;
    }

    public static void main(String[] args) {
//        String[] arr = {"50", "20", "60", "17", "34", "55", "89", "10", "", "28", "", "", "", "70", "", "", "14"};
        String[] arr = {"5", "3", "6", "2", "4", "", "7"};

        TreeNode root = buildTree(arr);
        preOrderDisplay(root);
        System.out.println();

        TreeNode ans = deleteTreeNode(root, 5);
        preOrderDisplay(ans);

    }

}
