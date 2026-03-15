package BinarySearchTree;

import java.util.*;

public class inorderPredecessorAndSuccessor {
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

    public static void inOrderDisplay(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        inOrderDisplay(root.left, list);
        list.add(root.val);
        inOrderDisplay(root.right, list);

    }

    public static void main(String[] args) {
        String[] arr = {"50", "30", "70", "20", "40", "60", "80"};
        TreeNode root = buildTree(arr);
        ArrayList<Integer> list = new ArrayList<>();
        inOrderDisplay(root, list);
        int key = 60;
        int idx = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                idx = i;
                break;
            }
        }
        int pred = list.get(idx - 1);
        int succ = list.get(idx + 1);
        System.out.println("predecessor = " + pred + "\n" + "successor = " + succ);

    }
}
