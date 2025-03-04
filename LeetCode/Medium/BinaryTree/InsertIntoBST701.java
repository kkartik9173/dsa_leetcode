package main.java.LeetCode.Medium.BinaryTree;

import main.java.LeetCode.Util.TreeNode;

public class InsertIntoBST701 {

    private TreeNode insertIntoBST(TreeNode root, int val) {
        //recursive approach
//        if(root == null) return new TreeNode(val);
//        else if(root.val > val)
//            root.left = insertIntoBST(root.left, val);
//        else
//            root.right = insertIntoBST(root.right, val);
//
//        return root;

        //Iterative approach
        if(root == null) return new TreeNode(val);

        TreeNode current = root;
            while(true){
                if(current.val < val){
                    if(current.right != null)
                        current = current.right;
                    else {
                        current.right = new TreeNode(val);
                        break;
                    }
                } else {
                    if(current.left != null){
                        current = current.left;
                    }
                    else{
                        current.left = new TreeNode(val);
                        break;
                    }
                }
            };

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        InsertIntoBST701 insertIntoBst = new InsertIntoBST701();
        TreeNode finalBST = insertIntoBst.insertIntoBST(root, 5);

        System.out.println(finalBST.toString());
    }


}
