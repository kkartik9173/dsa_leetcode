package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.TreeNode;

public class DetermineBalancedBinaryTree110 {


    boolean ans = true;
    public int solve(TreeNode root)
    {
        if(root == null)
            return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        if(Math.abs(left-right)>1)
            ans = false;
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        solve(root);
        return ans;
    }



    public static void main(String[] args) {

        TreeNode tn = new TreeNode(3);
        tn.left = new TreeNode(9);
        tn.right = new TreeNode(12);

        tn.right.left = new TreeNode(3);
        tn.right.right = new TreeNode(5);


        DetermineBalancedBinaryTree110 bbt =
                new DetermineBalancedBinaryTree110();

        System.out.println(bbt.isBalanced(tn));
    }
}
