package main.java.LeetCode.Medium.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

import java.util.*;

public class LevelOrderTraversal102 {


    private static List<List<Integer>> levelOrderTraversal(TreeNode root) {

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        List<List<Integer>> listInt = new ArrayList<>();

        treeNodeQueue.add(root);
        listInt.add(Arrays.asList(root.val));

        while(!treeNodeQueue.isEmpty()){
            int size = treeNodeQueue.size();
            List<Integer> lInt = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = treeNodeQueue.poll();

                if(node.left !=null){
                    treeNodeQueue.offer(node.left);
                    lInt.add(node.left.val);
                }
                if(node.right !=null) {
                    treeNodeQueue.offer(node.right);
                    lInt.add(node.right.val);
                }
            }
            if(!lInt.isEmpty())
                listInt.add(lInt);
        }

        return listInt;
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
        List<List<Integer>> lint = LevelOrderTraversal102.levelOrderTraversal(root);
        System.out.println(lint);
    }



}
