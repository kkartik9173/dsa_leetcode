package main.java.LeetCode.Util;

//InOrder:- Left -> Value(root)  -> right
//Preorder:- Value(root) -> left -> right
//Post Order:- left -> right -> value(root)
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    private static void inOrderTravsersal(TreeNode root) {

        if(root == null)
            return;

        inOrderTravsersal(root.left);

        System.out.print(root.val + " -> ");

        inOrderTravsersal(root.right);
    }

    private static void preOrderTravsersal(TreeNode root) {
        if(root == null)
            return;

        System.out.print(root.val + " -> ");
        preOrderTravsersal(root.left);
        preOrderTravsersal(root.right);
    }

    private static void postOrderTravsersal(TreeNode root) {
        if(root == null)
            return;

        postOrderTravsersal(root.left);
        postOrderTravsersal(root.right);
        System.out.print(root.val + " -> ");
    }


    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(8);
        root.right = new TreeNode(15);

        TreeNode leftNode = root.left;
        leftNode.left = new TreeNode(16);

        TreeNode rightNode = root.right;
        rightNode.left = new TreeNode(23);
        rightNode.right = new TreeNode(42);

        //System.out.println(root.right.left.val);
        System.out.println("Inorder Traversal");
        TreeNode.inOrderTravsersal(root);
        System.out.println();
        System.out.println("Pre Traversal");
        TreeNode.preOrderTravsersal(root);
        System.out.println();
        System.out.println("Post Traversal");
        TreeNode.postOrderTravsersal(root);
        System.out.println();

    }




}
