package hundreddayscodeforexperince.code;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}
public class SumOfNodeBST {
    public static void main(String[] args) {
        //Create the binary search tree from the input//root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.right=new TreeNode(6);
        root.left.left.left=new TreeNode(7);
        root.right.right.right=new TreeNode(8);
        
        //calculate and print the sum of all nodes
        int sum = sumOfNodes(root);
        System.out.println("Sum of all nodes: " + sum);
    }

    private static int sumOfNodes(TreeNode root) {
        if (root==null){
            return 0;
        }
        int leftSum =sumOfNodes(root.left);
        int rightSum =sumOfNodes(root.right);

        return root.val + leftSum + rightSum;
    }
}
