package main.java.LeetCode.Medium.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BalanceOfBST1382 {
    List<Integer> lInt = new ArrayList<>();
    private List<Integer> inOrderTravsersal(TreeNode root) {

        if(root == null)
            return lInt;

        inOrderTravsersal(root.left);

        System.out.print(root.val + " -> ");
        lInt.add(root.val);
        inOrderTravsersal(root.right);

        return lInt;
    }

    public TreeNode helper(List<Integer> lInt, int left, int right){
        if(left > right) return null;
        int mid = (left+right)/2;

        TreeNode root = new TreeNode(lInt.get(mid));
        root.left = helper(lInt, left, mid - 1);
        root.right = helper(lInt, mid+1, right);

        return root;
    }

    public TreeNode balanceBST(TreeNode root) {

        List<Integer> lInt = inOrderTravsersal(root);

        System.out.println(lInt.toString());

        return helper(lInt, 0, lInt.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        BalanceOfBST1382 balanceOfBST = new BalanceOfBST1382();
        TreeNode balanceBST = balanceOfBST.balanceBST(root);
        System.out.println("balanceBST " + balanceBST);

    }

}
