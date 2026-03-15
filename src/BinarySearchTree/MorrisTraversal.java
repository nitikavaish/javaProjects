package BinarySearchTree;

import java.util.*;

public class MorrisTraversal {
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

    public static TreeNode buildTree(String[] arr) {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        TreeNode root = new TreeNode(x);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < n - 1) {
            TreeNode temp = q.remove();
            TreeNode left = new TreeNode(10);
            TreeNode right = new TreeNode(100);
            if (arr[i].equals("")) left = null;
            else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if (arr[i + 1].equals("")) right = null;
            else {
                int r = Integer.parseInt(arr[i + 1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) { //find pred
                TreeNode pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }
                if (pred.right == null) {// connect pred with curr
                    pred.right = curr;
                    curr = curr.left;
                }
                if (pred.right == curr) {// disconnect pred with curr

                    pred.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }
            } else {// curr.left=null , no pred
                ans.add(curr.val);
                curr = curr.right;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "", "8", "", "", "6", "7", "9"};
        TreeNode root = buildTree(arr);
        List<Integer> ans = inorderTraversal(root);
        System.out.println(ans);


    }
}
