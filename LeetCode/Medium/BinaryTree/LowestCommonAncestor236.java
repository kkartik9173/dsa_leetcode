package main.java.LeetCode.Medium.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

import java.util.*;

public class LowestCommonAncestor236 {

    //Not working
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if(root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null ) return root;

        if(left != null ) return left;

        return right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        TreeNode leftNode = root.left;
        leftNode.left = new TreeNode(6);
        leftNode.right = new TreeNode(2);
        leftNode.right.left = new TreeNode(7);
        leftNode.right.right = new TreeNode(4);

        TreeNode rightNode = root.right;
        rightNode.left = new TreeNode(0);
        rightNode.right = new TreeNode(8);

        System.out.println("Level Common Ancestor");
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);

        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(4);
        LowestCommonAncestor236 lowestCommonAncestor = new LowestCommonAncestor236();
        TreeNode ancestor = lowestCommonAncestor.lowestCommonAncestor(root, p, q);

        if(ancestor == null){
            System.out.println("No common ancestor found");
        }
        else{
            System.out.println(ancestor.val);
        }
    }


}
