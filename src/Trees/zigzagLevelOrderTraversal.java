package Trees;

public class zigzagLevelOrderTraversal {
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
        if ((root == null) || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));

    }

    public static void nthLevel_LR(TreeNode root, int n) { // left to right
        if (root == null) return;
        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        nthLevel_LR(root.left, n - 1);
        nthLevel_LR(root.right, n - 1);
    }

    public static void nthLevel_RL(TreeNode root, int n) {
        if (root == null) return;
        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        nthLevel_RL(root.right, n - 1);
        nthLevel_RL(root.left, n - 1);
    }

    public static void zigzagTraversal(TreeNode root) {
        int level = height(root) + 1;
        for (int j = 1; j <= level; j++) {
            if (j % 2 != 0) {
                nthLevel_LR(root, j);
            } else {
                nthLevel_RL(root, j);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(8);
        TreeNode h = new TreeNode(9);
        TreeNode i = new TreeNode(10);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        c.right = g;
        e.left = h;
        f.left = i;
        zigzagTraversal(root);
    }
}
