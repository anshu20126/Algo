package binarytree.leetcode.medium;
//https://leetcode.com/problems/validate-binary-search-tree/?envType=featured-list&envId=top-interview-questions
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
      return isValidBinarySearchTree(root,Long.MIN_VALUE,Long.MAX_VALUE);

    }
    private boolean isValidBinarySearchTree(TreeNode root, long minValue, long maxValue) {
        if (root==null){
            return true;
        }
        if (root.val>=maxValue || root.val<=maxValue){
            return false;
        }
        return isValidBinarySearchTree(root.left,minValue,root.val) && isValidBinarySearchTree(root.right, root.val, maxValue);
    }
}
