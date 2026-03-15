package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class pathSum3 {
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

    public static int noOfPaths(TreeNode root, int sum) {
        if (root == null) return 0;
        int cnt = 0;
        if (root.val == sum) {
            cnt++;
        }
        return cnt + noOfPaths(root.left, sum - root.val) + noOfPaths(root.right, sum - root.val);
    }

    public static int pathSum(TreeNode root, int tsum) {

        if (root == null) return 0;
        int cnt = noOfPaths(root, tsum);
        cnt = cnt+pathSum(root.left, tsum) + pathSum(root.right, tsum);
        return cnt;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(-3);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(2);
        TreeNode g = new TreeNode(1);
        TreeNode h = new TreeNode(11);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        c.left = e;
        c.right = f;
        d.right = g;
        b.right = h;
        int ans = pathSum(root, 8);
        System.out.println(ans);
    }
}
