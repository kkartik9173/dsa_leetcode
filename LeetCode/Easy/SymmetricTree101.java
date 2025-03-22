package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree101 {



    public boolean isTreeSymmetric(TreeNode leftRoot, TreeNode rightRoot){
       if(leftRoot == null && rightRoot == null)
           return true;

       if((leftRoot == null && rightRoot != null) || (leftRoot != null && rightRoot == null))
           return false;

       if(leftRoot.val != rightRoot.val)
            return false;

       return isTreeSymmetric(leftRoot.left, rightRoot.right) && isTreeSymmetric(leftRoot.right, rightRoot.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return isTreeSymmetric(root.left, root.right);
    }

    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.left = new TreeNode(2);
        tn.right = new TreeNode(2);

        tn.left.left = new TreeNode(3);
        tn.left.right = new TreeNode(4);

        tn.right.left = new TreeNode(4);
        tn.right.right = new TreeNode(3);

        SymmetricTree101 sm = new SymmetricTree101();
        Boolean res = sm.isSymmetric(tn);

        System.out.println(res);
    }
}
