package binarytree.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-inorder-traversal/description/
public class InorderTraversal {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    public static void main(String[] args) {
       //TreeNode root = [1,2,3]
        //System.out.println(inorderTraversal(root));
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            if(root!=null){
                ans.addAll(inorderTraversal(root.left));
                ans.add(root.val);
                ans.addAll(inorderTraversal(root.right));
            }
            return ans;
        }
    }

