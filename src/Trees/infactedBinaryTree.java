package Trees;

import java.util.*;

public class infactedBinaryTree {
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

    public static TreeNode getValue(TreeNode root, int start) {
        if (root == null) return null;
        if (root.val == start) return root;
        TreeNode left = getValue(root.left, start);
        TreeNode right = getValue(root.right, start);
        if (left == null) return right;
        else return left;
    }

    public static void preorder(TreeNode root, HashMap<TreeNode, TreeNode> p) {
        if (root == null) return;
        if (root.left != null) p.put(root.left, root);
        if (root.right != null) p.put(root.right, root);
        preorder(root.left, p);
        preorder(root.right, p);
    }

    public static int infactionTime(TreeNode root, int start) {
        TreeNode node = getValue(root, start);
        HashMap<TreeNode, TreeNode> p = new HashMap<>();
        preorder(root, p);
        // bfs
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        Map<TreeNode, Integer> v = new HashMap<>();
        v.put(node, 0);
        while (q.size() > 0) {
            TreeNode temp = q.peek();
            int level = v.get(temp);
            if (temp.left != null && !v.containsKey(temp.left)) {
                q.add(temp.left);
                v.put(temp.left, level + 1);
            }
            if (temp.right != null && !v.containsKey(temp.right)) {
                q.add(temp.right);
                v.put(temp.right, level + 1);
            }
            if (p.containsKey(temp) && !v.containsKey(p.get(temp))) {
                q.add(p.get(temp));
                v.put(p.get(temp), level + 1);
            }
            q.remove();
        }
        int max = -1;
        for (int level : v.values()) {
            max = Math.max(max, level);
        }
        return max;

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
        int ans = infactionTime(root, 3);
        System.out.println(ans);

    }
}
