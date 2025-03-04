package main.java.LeetCode.Easy.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthBinaryTree111 {

    public static int minDepth(TreeNode root) {
        if(root == null) return 0;

        int depth = 1;

        Queue<TreeNode> minDepthQueue = new LinkedList<>();
        minDepthQueue.offer(root);

        while(!minDepthQueue.isEmpty()){
            int size = minDepthQueue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = minDepthQueue.poll();

                if(node.left == null && node.right == null)
                    return depth;

                if(node.left !=null) minDepthQueue.offer(node.left);
                if(node.right !=null) minDepthQueue.offer(node.right);
            }
            depth++;
        }

        return depth;
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

       int depth = MinimumDepthBinaryTree111.minDepth(root);

            System.out.println("int value " + depth);
    }


}
