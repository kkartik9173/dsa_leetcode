package main.java.LeetCode.Medium.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

public class KthSmallestElementInBST230 {

    int k;
    int result = 0;
    private void inOrderTravsersal(TreeNode root) {

        if(root == null)
            return;

        inOrderTravsersal(root.left);
        if(--k == 0){
            result = root.val;
            return;
        }
        inOrderTravsersal(root.right);

    }
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        inOrderTravsersal(root);

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        KthSmallestElementInBST230 kthSmallestElementInBST230 =
                new KthSmallestElementInBST230();
        int result = kthSmallestElementInBST230.kthSmallest(root, 2);
        System.out.println(result);

    }
}
