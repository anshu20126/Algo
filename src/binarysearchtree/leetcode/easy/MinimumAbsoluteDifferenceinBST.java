package binarysearchtree.leetcode.easy;
//https://leetcode.com/problems/minimum-absolute-difference-in-bst/?envType=study-plan-v2&id=top-interview-150

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class MinimumAbsoluteDifferenceinBST {
    //When we do inorder traversal on a bst we get all values sorted in increasing order. This is the logic that will be applied here
    int diff = 100001;
    int prev = -1;

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return diff;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (prev != -1) diff = Math.min(diff, root.val - prev);
        prev = root.val;
        dfs(root.right);
    }
}



