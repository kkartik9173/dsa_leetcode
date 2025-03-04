package main.java.LeetCode.Medium.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

public class MaximumMinimumValueBinaryTree {

    static int findMax(TreeNode node)
    {
        if (node == null)
            return Integer.MIN_VALUE;

        int res = node.val;
        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }

    static int findMin(TreeNode node)
    {
        if (node == null)
            return Integer.MAX_VALUE;

        int res = node.val;
        int lres = findMin(node.left);
        int rres = findMin(node.right);

        if (lres < res)
            res = lres;
        if (rres < res)
            res = rres;
        return res;
    }

    public static void main(String args[])
    {
        TreeNode tree = new TreeNode(2);
        tree.left = new TreeNode(7);
        tree.right = new TreeNode(5);
        tree.left.right = new TreeNode(6);
        tree.left.right.left = new TreeNode(1);
        tree.left.right.right = new TreeNode(11);
        tree.right.right = new TreeNode(9);
        tree.right.right.left = new TreeNode(4);

        // Function call
        System.out.println("Maximum element is "
                + MaximumMinimumValueBinaryTree.findMax(tree));
        System.out.println("Maximum element is "
                + MaximumMinimumValueBinaryTree.findMin(tree));
    }
}
