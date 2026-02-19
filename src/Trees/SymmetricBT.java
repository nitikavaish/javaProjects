package Trees;

public class SymmetricBT {
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

    public static TreeNode inversion(TreeNode root) {
        if (root == null) return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        inversion(root.left);
        inversion(root.right);
        return root;
    }

    public static boolean isSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return (isSame(p.left, q.left) && isSame(p.right, q.right));

    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        // invert left part of tree
        root.left = inversion(root.left);
        // if left part of tree equal hoga right part of tree ke to iska
        // matlab wo symmetric tha
        return isSame(root.left, root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(3);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        System.out.println(isSymmetric(root));
    }
}
