package main.java.LeetCode.Easy.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

import java.util.Stack;

public class InvertBinaryTree226 {

    private static TreeNode invertTree(TreeNode root) {
        if(root == null ) return root;

        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;

        invertTree(root.left);
        invertTree(root.right);

        return root;
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

        TreeNode invertTreeNode = InvertBinaryTree226.invertTree(root);
        System.out.println(invertTreeNode);
    }

}
