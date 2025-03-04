package main.java.LeetCode.Easy.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

public class SortedArrayToBST108 {

    private static TreeNode helper(int[] nums, int left, int right) {

        if (left > right) return null;
        int mid = (left + right)/2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid-1);
        root.right = helper(nums, right, mid+1);

        return root;
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {

        int[] nums = {-10,-3,0,5,9};

        TreeNode tn = SortedArrayToBST108.sortedArrayToBST(nums);

        System.out.println(tn.toString());

    }
}
