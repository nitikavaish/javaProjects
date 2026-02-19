package Trees;

import java.util.*;

public class binaryTreePaths {
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

    public static void helper(TreeNode root, List<String> list, String s) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            s += root.val;
            list.add(s);
            return;
        }
        helper(root.left, list, s + root.val + "->");
        helper(root.right, list, s + root.val + "->");

    }

    public static List<String> binaryPaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root, ans, "");
        return ans;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        List<String> ans = binaryPaths(root);
        System.out.println(ans);
    }
}
