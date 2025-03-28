package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BTPostOrderTraversal145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> iList = new ArrayList<>();

        return postorderTraversal(root, iList);
    }

    private List<Integer> postorderTraversal(TreeNode root, List<Integer> iList) {
        if(root == null )
            return iList;

        postorderTraversal(root.left, iList);
        postorderTraversal(root.right, iList);
        iList.add(root.val);

        return iList;
    }

    public static void main(String[] args) {

        TreeNode tn = new TreeNode(1);
        tn.right = new TreeNode(2);
        tn.right.left = new TreeNode(3);

        BTPostOrderTraversal145 btPostOrderTraversal = new
                BTPostOrderTraversal145();
        List<Integer> resultList = btPostOrderTraversal.postorderTraversal(tn);
        System.out.println(resultList.toString());
    }
}
