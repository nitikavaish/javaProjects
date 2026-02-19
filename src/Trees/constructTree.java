package Trees;

public class constructTree {
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

    public static TreeNode helper(int[] preorder, int prelo, int prehi, int[] inorder, int inlo, int inhi) {
        if (prelo > prehi) return null;
        TreeNode root = new TreeNode(preorder[prelo]);
        int i = inlo;
        while (inorder[i] != preorder[prelo]) i++;
        // left size
        int ls = i - inlo;
        root.left = helper(preorder, prelo + 1, prelo + ls, inorder, inlo, i - 1);
        root.right = helper(preorder, prelo + ls + 1, prehi, inorder, i + 1, inhi);
        return root;
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    public static void display(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " -> ");
        if (root.left != null) System.out.print(root.left.val + " ,");
        else System.out.print("n ,");
        if (root.right != null) System.out.print(root.right.val);
        else System.out.print("n");
        System.out.println();
        display(root.left);
        display(root.right);


    }


    public static void main(String[] args) {
        int[] preorder = {1, 2, 4, 5, 3, 6};
        int[] inorder = {4, 2, 5, 1, 3, 6};

        TreeNode ans = buildTree(preorder, inorder);
        display(ans);
    }
}
