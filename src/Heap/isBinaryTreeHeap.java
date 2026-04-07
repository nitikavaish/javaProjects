package Heap;

import BinarySearchTree.traversals;

import java.util.*;

public class isBinaryTreeHeap {
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

    static int s;

    public static int size(TreeNode root) {
        if (root == null) return 0;
        return size(root.left) + size(root.right) + 1;
    }

    public static boolean isHeap(TreeNode root) {
        s = size(root);
        return isMaxHeap(root) && isCBT(root, 1);
    }

    private static boolean isCBT(TreeNode root, int idx) {
        if (root == null) return true;
        if (idx > s) return false;
        return isCBT(root.left, 2 * idx) && isCBT(root.right, 2 * idx + 1);
    }

    private static boolean isMaxHeap(TreeNode root) {
        if (root == null) return true;
        int leftVal = (root.left != null) ? root.left.val : Integer.MIN_VALUE;
        int rightVal = (root.right != null) ? root.right.val : Integer.MIN_VALUE;
        if (root.val <= leftVal || root.val <= rightVal) return false;
        return isMaxHeap(root.left) && isMaxHeap(root.right);

    }

    public static void main(String[] args) {
        String arr[] = {"97", "46", "37", "12", "3", "7", "31", "6", "9"};
        TreeNode root = buildTree(arr);
        boolean res = isHeap(root);
        System.out.println(res);
    }
}
