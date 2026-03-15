package BinarySearchTree;

public class searchInBST {
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

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        else if (val < root.val) return searchBST(root.left, val);
        else return searchBST(root.right, val);

    }

    public static void preOrderDisplay(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrderDisplay(root.left);
        preOrderDisplay(root.right);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(7);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(3);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        TreeNode ans = searchBST(root, 2);
        preOrderDisplay(ans);

    }
}
