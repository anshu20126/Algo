package binarytree.leetcode.easy;
//https://leetcode.com/problems/path-sum/?envType=study-plan-v2&envId=top-interview-150
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null && root.val == targetSum) // Leaf check
            return true;

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}

