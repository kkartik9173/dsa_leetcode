package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;



public class BTPreOrderTraversal144 {

    private List<Integer> preorderTraversal(TreeNode root, List<Integer> iList) {
        if(root == null) return iList;

        iList.add(root.val);
        preorderTraversal(root.left, iList);
        preorderTraversal(root.right, iList);

        return iList;
    }


    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> iList = new ArrayList<>();

        return preorderTraversal(root, iList);

    }



    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.right = new TreeNode(2);
        tn.right.left = new TreeNode(3);

        BTPreOrderTraversal144 btPreOrderTraversal = new BTPreOrderTraversal144();
        List<Integer> resultList = btPreOrderTraversal.preorderTraversal(tn);
        System.out.println(resultList.toString());


    }
}
