package Trees;

public class SameTree {
    // leetcode 100
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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));

    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(1);
        TreeNode a1 = new TreeNode(9);
        TreeNode b1 = new TreeNode(20);
        TreeNode c1 = new TreeNode(20);
        TreeNode a2 = new TreeNode(9);
        TreeNode b2 = new TreeNode(20);
        root1.left = a1;
        root1.right = b1;
        a1.left = c1;
        root2.left = a2;
        root2.right = b2;
        boolean result = isSameTree(root1, root2);
        System.out.println(result);


    }
}
