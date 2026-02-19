package Trees;

public class BalanceBinaryTree {
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

    public static int height(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));

    }

    public static boolean isBalance(TreeNode root) {
        if (root == null) return true;
        int leftHeight = height(root.left);
        if (root.left != null) leftHeight++;
        int rightHeight = height(root.right);
        if (root.right != null) rightHeight++;
        int diff = Math.abs(leftHeight - rightHeight);
        if (diff > 1) return false;
        return (isBalance(root.left) && isBalance(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(9);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(7);
        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;
//        TreeNode a = new TreeNode(2);
//        TreeNode b = new TreeNode(3);
//        root.right = a;
//        a.right = b;

        boolean check = isBalance(root);
        System.out.println(check);


    }
}
