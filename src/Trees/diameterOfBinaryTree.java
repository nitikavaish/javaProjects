package Trees;

public class diameterOfBinaryTree {
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

    public static int findDiameter(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        int leftAns = findDiameter(root.left);
        int rightAns = findDiameter(root.right);
        int mid = height(root.left) + height(root.right);
        if (root.left != null) mid++;
        if (root.right != null) mid++;
        int max = Math.max(mid, Math.max(leftAns, rightAns));
        return max;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(1);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        System.out.println(findDiameter(root));
    }
}
