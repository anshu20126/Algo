package binarytree.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/leaf-similar-trees/?envType=study-plan-v2&envId=leetcode-75
public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> tree1 = new ArrayList<>();
        List<Integer> tree2 = new ArrayList<>();

        dfs(root1,tree1);
        dfs(root2,tree2);

        return tree1.equals(tree2);
    }

    public void dfs(TreeNode root,List<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        dfs(root.left,list);
        dfs(root.right,list);
    }
}
