package main.java.LeetCode.Easy.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

import java.util.*;

public class AverageOfLevelsInBinaryTree637 {
    
    private static List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.add(root);
        levelQueue.add(null);

        List<Double> averageList = new ArrayList<>();

        while(levelQueue.peek() != null){
            double sum = 0;
            int nodes = 0;

            while(levelQueue.peek() != null){
                TreeNode node = levelQueue.poll();
                sum += node.val;
                nodes++;

                if(node.left !=null) levelQueue.add(node.left);
                if(node.right !=null) levelQueue.add(node.right);
            }
            levelQueue.add(levelQueue.poll());
            averageList.add(sum/nodes);
        }

        return averageList;
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

        List<Double> avgLevel = AverageOfLevelsInBinaryTree637.averageOfLevels(root);

        for (double d: avgLevel) {
            System.out.println("double value " + d);
        }
    }

}
