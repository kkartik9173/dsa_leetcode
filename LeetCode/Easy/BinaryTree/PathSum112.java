package main.java.LeetCode.Easy.BinaryTree;

import com.sun.source.tree.Tree;
import main.java.LeetCode.Util.TreeNode;

import java.util.Stack;

public class PathSum112 {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
          //Best and efficient
//        if(root == null) return false;
//
//        targetSum -= root.val;
//
//        if(root.left == null && root.right == null){
//            return targetSum == 0;
//        }
//
//        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);

        if(root == null) return false;

        Stack<TreeNode> path = new Stack<>();
        Stack<Integer>  sumPath = new Stack<>();

        path.push(root);
        sumPath.push(root.val);

        while(!path.isEmpty()){

            TreeNode temp = path.pop();
            int tempVal = sumPath.pop();

            if(temp.left == null && temp.right == null && tempVal == targetSum){
                return true;
            }

            if(temp.right != null){
                path.push(temp.right);
                sumPath.push(temp.right.val + tempVal);
            }
            if(temp.left != null){
                path.push(temp.left);
                sumPath.push(temp.left.val + tempVal);
            }
        }

        return false;

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        TreeNode leftNode = root.left;
        leftNode.left = new TreeNode(11);

        TreeNode rightNode = root.right;
        rightNode.left = new TreeNode(13);
        rightNode.right = new TreeNode(4);


        System.out.println("Level order Traversal");

        boolean pathSumExist = PathSum112.hasPathSum(root, 25);
        System.out.println(pathSumExist);
    }
}
