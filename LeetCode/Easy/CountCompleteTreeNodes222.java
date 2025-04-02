package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class CountCompleteTreeNodes222 {

    public int countNodes(TreeNode root) {
        return traverse(root, 0);
    }

    private int traverse(TreeNode node, int count) {
        if (node == null) {
            return count;
        }
        count++;
        if (node.left != null) {
            count = count + traverse(node.left, 0);
        }
        if (node.right != null) {
            count = count + traverse(node.right, 0);
        }
        return count;
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


        CountCompleteTreeNodes222 count = new
                CountCompleteTreeNodes222();

        System.out.println("final Count " + count.countNodes(root));
    }
}
