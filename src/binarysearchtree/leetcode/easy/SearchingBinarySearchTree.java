package binarysearchtree.leetcode.easy;
//https://leetcode.com/problems/search-in-a-binary-search-tree/description/
public class SearchingBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(val==root.val) return root;
        if(val<root.val) return searchBST(root.left,val);
        if(val>root.val) return searchBST(root.right,val);

        return null;
    }
}
