package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BTInorderTraversal94 {

    private List<Integer> inOrderTravsersal(TreeNode root,  List<Integer> listInt) {

        if(root == null)
            return listInt;

        inOrderTravsersal(root.left, listInt);

        //System.out.print(root.val + " -> ");
        listInt.add(root.val);

        inOrderTravsersal(root.right, listInt);

        return listInt;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> listInt = new ArrayList<>();

        return inOrderTravsersal(root, listInt);
    };

    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.right = new TreeNode(2);
        tn.right.left = new TreeNode(3);

        BTInorderTraversal94 btInorderTraversal = new BTInorderTraversal94();
        List<Integer> resultList = btInorderTraversal.inorderTraversal(tn);
        System.out.println(resultList.toString());

    }
}
