package main.java.LeetCode.Easy.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

public class SearchInABinarySearchTree700 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        SearchInABinarySearchTree700 searchInABinarySearchTree700
                = new SearchInABinarySearchTree700();

        TreeNode searchResultNode = searchInABinarySearchTree700.searchBST(root, 2);
        if(searchResultNode != null)
            System.out.println(searchResultNode.toString());
        else
            System.out.println("search result not found");

    }

    public TreeNode searchBST(TreeNode root, int val) {

        if(root == null)
            return root;

        if(root.val > val)
            return searchBST(root.left, val );

        if (root.val < val)
            return searchBST(root.right, val );

        return root;

    };
}
