package main.java.LeetCode.Easy.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

public class MinimumAbsDiffBST530 {
    private int minDifference;
    private int previousValue;
    private static final int MAX_VAL = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        minDifference = MAX_VAL; // Initialize minimum difference to the largest value possible
        previousValue = MAX_VAL; // Initialize previous value to the largest value possible for the start
        inOrderTraversal(root); // Perform in-order traversal to compare node values
        return minDifference; // Return the smallest difference found
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return; // Base case: if root is null, return to stop the traversal
        }
        inOrderTraversal(root.left); // Visit left subtree

        // Compute the minimum difference with the previous value (if not first node)
        if (previousValue != MAX_VAL) {
            minDifference = Math.min(minDifference, Math.abs(root.val - previousValue));
        }// Update the previous value to the current node's value
        previousValue = root.val;

        inOrderTraversal(root.right); // Visit right subtree
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        MinimumAbsDiffBST530 minimumAbsDiffBST530 = new MinimumAbsDiffBST530();
        int x= minimumAbsDiffBST530.getMinimumDifference(root);
        System.out.println(x);

    }
}
