package main.java.LeetCode.Medium.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

public class LowestCommonAncestorBST235 {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);

        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);

        return root;

    };

    public static void main(String[] args) {

        TreeNode root = new TreeNode(6);

        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);

        TreeNode ancestor = LowestCommonAncestorBST235.lowestCommonAncestor(root, p, q);
        System.out.println(ancestor != null ? ancestor.toString() : ancestor );
    }
}
