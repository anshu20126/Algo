package binarytree.leetcode.easy;
//https://leetcode.com/problems/same-tree/
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
       // If both trees are empty,return true
        if (p == null && q == null) {
            return true;
        }
        // If one of the trees is empty and the other is not, return false
        if (p == null || q == null) {
            return false;
        }

        // If the values at the current nodes of the two trees are different, return false
        if (p.val != q.val) {
            return false;
        }

        // Recursively compare the left and right subtrees of the two trees
        // If both subtrees are the same, the two trees are the same
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
/*class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }*/

