package array.leetcode.easy;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/?envType=featured-list&envId=top-interview-questions
public class ConvertSortedArraytoBST {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        int[] nums1 = {10, -3, 0, 5, 9};
        TreeNode root = sortedArrayToBST(nums);
        printTree(root);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return createBst(nums, 0, nums.length - 1);
    }

    private static TreeNode createBst(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBst(nums, start, mid - 1);
        root.right = createBst(nums, mid + 1, end);
        return root;
    }

    private static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
