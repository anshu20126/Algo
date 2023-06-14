package binarytree.leetcode.easy;
//https://leetcode.com/problems/invert-binary-tree/solutions/62719/my-simple-recursion-java-solution/?envType=study-plan-v2&envId=top-interview-150
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right =invertTree(root.right);
        root.left=right;
        root.right=left;

        return root;
    }
}
