package main.java.LeetCode.Medium.BinaryTree;

import main.java.LeetCode.Util.TreeNode;
//Check this properly
public class DeleteNodeInBST450 {

    private TreeNode getMin(TreeNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;

        if (root.val == key) {
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;
            TreeNode minNode = getMin(root.right);
            root.right = deleteNode(root.right, minNode.val);
            minNode.left = root.left;
            minNode.right = root.right;
            root = minNode;
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            root.left = deleteNode(root.left, key);
        }

        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(7);

        DeleteNodeInBST450 deleteNodeInBST450 = new DeleteNodeInBST450();

        TreeNode finalResult = deleteNodeInBST450.deleteNode(root, 3);
        System.out.println(finalResult.toString());
    }
}
