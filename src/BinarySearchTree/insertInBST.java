package BinarySearchTree;

public class insertInBST {
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

    public static TreeNode insertIn(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (val > root.val) {
            if (root.right == null) root.right = new TreeNode(val);
            else insertIn(root.right, val);
        } else {
            if (root.left == null) root.left = new TreeNode(val);

            else insertIn(root.left, val);
        }
        return root;
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
        preOrderDisplay(root);
        System.out.println();
        TreeNode ans = insertIn(root, 8);
        preOrderDisplay(ans);
    }
}
