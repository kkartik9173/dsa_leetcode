package main.java.LeetCode.Easy.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DiameterOfBinaryTree543 {

    public static int diameterOfBinaryTree(TreeNode root) {
        Map<TreeNode, Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        int diameter = 0;

        if (root != null)
            stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();

            // Fill up stack to perform post-order traversal
            if (node.left != null && !map.containsKey(node.left)) {
                stack.push(node.left);
            } else if (node.right != null && !map.containsKey(node.right)) {
                stack.push(node.right);
            } else {

                // Process the root, once left and right sub-tree have been processed
                stack.pop();
                int leftDepth = map.getOrDefault(node.left, 0);
                int rightDepth = map.getOrDefault(node.right, 0);

                // Put the max depth at a node in the map
                map.put(node, 1 + Math.max(leftDepth, rightDepth));

                // Update the max diameter found so far
                diameter = Math.max(diameter, leftDepth + rightDepth);
            }
        }
        return diameter;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        TreeNode leftNode = root.left;
        leftNode.left = new TreeNode(11);

        TreeNode rightNode = root.right;
        rightNode.left = new TreeNode(13);
        rightNode.right = new TreeNode(4);


        System.out.println("Level order Traversal");

        int diameter = DiameterOfBinaryTree543.diameterOfBinaryTree(root);
        System.out.println(diameter);
    }
}

