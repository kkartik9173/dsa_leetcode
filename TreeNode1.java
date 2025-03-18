package main.java;

import main.java.LeetCode.Easy.BinaryTree.InvertBinaryTree226;
import main.java.LeetCode.Util.TreeNode;

public class TreeNode1 {
    int val;
    TreeNode1 left;

    public TreeNode1(int val) {
        this.val = val;
    }

    TreeNode1 right;

    public TreeNode1() {
    }

    public TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode1{" +
                "val=" + val +
                '}';
    }

    public static void main(String[] args) {

        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);

        TreeNode1 leftNode = root.left;
        leftNode.left = new TreeNode1(4);

        TreeNode1 rightNode = root.right;
        rightNode.left = new TreeNode1(5);
        rightNode.right = new TreeNode1(6);
        TreeNode1 tn1 = new TreeNode1();
        TreeNode1 resultNode = tn1.invertTree(root);
        System.out.println(resultNode);
    }

    private TreeNode1 invertTree(TreeNode1 root) {
        if(root == null) return null;

        TreeNode1 tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
