package Trees;

import java.util.*;

public class pathSum2 {
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

    public static void helper(TreeNode root, List<Integer> arr, List<List<Integer>> ans, int sum) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            arr.add(root.val);
            if (root.val == sum) {
                List<Integer> list = new ArrayList<>();
                for (int i : arr) {
                    list.add(i);
                }
                ans.add(list);
            }
            arr.remove(arr.size() - 1);
            return;
        }
        arr.add(root.val);
        helper(root.left, arr, ans, sum - root.val);
        helper(root.right, arr, ans, sum - root.val);
        arr.remove(arr.size() - 1);
    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        if (root == null) return ans;
        helper(root, arr, ans, sum);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode a = new TreeNode(4);
        TreeNode b = new TreeNode(8);
        TreeNode c = new TreeNode(11);
        TreeNode d = new TreeNode(13);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(2);
        TreeNode h = new TreeNode(5);
        TreeNode i = new TreeNode(1);
        root.left = a;
        root.right = b;
        a.left = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.left = h;
        e.right = i;
        List<List<Integer>> ans = pathSum(root, 22);
        System.out.println(ans);
    }
}
