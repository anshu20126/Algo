package binarytree.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/binary-tree-preorder-traversal/description/
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root!=null){
            res.add(root.val);
            res.addAll(preorderTraversal(root.left));
            res.addAll(preorderTraversal(root.right));
        }
        return res;
    }
}
