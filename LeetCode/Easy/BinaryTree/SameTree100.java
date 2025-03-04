package main.java.LeetCode.Easy.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree100 {

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> treeComparisionQueue = new LinkedList<>();
        treeComparisionQueue.add(p);
        treeComparisionQueue.add(q);
        while(!treeComparisionQueue.isEmpty()){
            TreeNode first = treeComparisionQueue.poll();
            TreeNode second = treeComparisionQueue.poll();
            if(first == null && second == null) continue;
            else if (first == null || second == null || first.val != second.val) {
                return false;
            }
            treeComparisionQueue.add(first.left);
            treeComparisionQueue.add(second.left);
            treeComparisionQueue.add(first.right);
            treeComparisionQueue.add(second.right);

        }

        return true;
    }

    public static void main(String[] args) {

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        //p.left.left = new TreeNode(5);

        TreeNode q= new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(SameTree100.isSameTree(p,q));
    }


}
