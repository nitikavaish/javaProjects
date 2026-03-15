package Trees;

public class flatten_Method_2 {
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

    public static void flatten(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                TreeNode p = cur.left;
                while (p.right != null) {
                    p = p.right;
                }
                p.right = cur.right;
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
    }

    public static void preOrderDisplay(TreeNode root) {
        if (root == null) {
            System.out.print("null ");
            return;
        }
        if (root.left == null && root.right == null) return;

        System.out.print(root.val + " ");
        preOrderDisplay(root.left);
        preOrderDisplay(root.right);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(6);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        flatten(root);
        preOrderDisplay(root);
    }
}
