package main.java.LeetCode.Easy.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthBinaryTree104 {

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int depth = 0;

        Queue<TreeNode> maxDepthQueue = new LinkedList<>();
        maxDepthQueue.offer(root);

        while(!maxDepthQueue.isEmpty()){
            int size = maxDepthQueue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = maxDepthQueue.poll();

                if(node.left !=null) maxDepthQueue.offer(node.left);
                if(node.right !=null) maxDepthQueue.offer(node.right);
            }
            depth++;
        }

        return depth;
//Easiest
//        if (root == null) return 0;
//        int leftDepth = maxDepth(root.left);
//        int rightDepth = maxDepth(root.right);
//
//        return 1 + Math.max(leftDepth, rightDepth);
    }
    
    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(8);
        root.right = new TreeNode(4);

        TreeNode leftNode = root.left;
        leftNode.left = new TreeNode(3);
        leftNode.right = new TreeNode(7);

        TreeNode rightNode = root.right;
        rightNode.right = new TreeNode(1);

        rightNode.right.left = new TreeNode(6);

        System.out.println("Level order Traversal");

       int depth = MaximumDepthBinaryTree104.maxDepth(root);

            System.out.println("int value " + depth);
    }


}
