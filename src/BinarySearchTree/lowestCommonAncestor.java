package BinarySearchTree;

import java.util.*;

public class lowestCommonAncestor {
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

    public static TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (p.val <= root.val && q.val >= root.val) return root;
        else if (p.val >= root.val && q.val <= root.val) return root;
        else if (p.val <= root.val && q.val <= root.val) return LCA(root.left, p, q);
        else if (p.val >= root.val && q.val >= root.val) return LCA(root.right, p, q);
        return null;
    }


    public static void main(String[] args) {
        String[] arr = {"6", "2", "8", "0", "4", "7", "9", "", "", "3", "5"};
        TreeNode root = buildTree(arr);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);

        TreeNode lca = LCA(root, p, q);
        System.out.println(lca.val);

    }
}
