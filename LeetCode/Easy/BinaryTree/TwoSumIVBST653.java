package main.java.LeetCode.Easy.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

import java.util.HashSet;

public class TwoSumIVBST653 {



    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        SearchInABinarySearchTree700 searchInABinarySearchTree700
                = new SearchInABinarySearchTree700();

        boolean exist = TwoSumIVBST653.findTarget(root, 10);
        System.out.println(exist);

    }

    public static boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hSet = new HashSet<>();
        return searchBST(root, k, hSet);
    }
    public static boolean searchBST(TreeNode root, int k, HashSet<Integer> hSet) {

        if(root == null)
            return false;

        if(hSet.contains(k-root.val))
            return true;
        hSet.add(root.val);

        return searchBST(root.left, k, hSet) || searchBST(root.right, k, hSet);

    };
}


