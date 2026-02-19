package Trees;

public class LowestCommonAncestor {
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

    public static boolean isContains(TreeNode root, TreeNode node) {
        if (root == null) return false;
        if (root == node) return true;
        return (isContains(root.left, node) || isContains(root.right, node));

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p == root || q == root) return root;
        if (p == q) return p;
        boolean leftp = isContains(root.left, p);
        boolean rightq = isContains(root.right, q);
        if ((leftp && rightq) || (!leftp && !rightq)) return root;
        if (leftp == true && rightq == false) return lowestCommonAncestor(root.left, p, q);
        if (leftp == false && rightq == true) return lowestCommonAncestor(root.right, p, q);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(18);
        TreeNode h = new TreeNode(10);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        d.left = e;
        b.right = f;
        f.left = g;
        f.right = h;
        TreeNode ans = lowestCommonAncestor(root, null, e);
        System.out.println(ans.val);
    }
}
