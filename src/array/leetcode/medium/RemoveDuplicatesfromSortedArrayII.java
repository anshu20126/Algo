package array.leetcode.medium;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicatesfromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        //Turns true if there's a duplicate element
        boolean present = false;
        int count = 1; //Since i starts from 1 below

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                //First encounter of duplicate element
                if (!present) {
                    nums[count++] = nums[i];
                    present = true; //Indicate we have already visited duplicate
                }
            } else {//No duplicate ,business as usual
                nums[count++] = nums[i];
                present = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};//output 5
        int[] arr1 = {0, 0, 1, 1, 1, 1, 2, 3, 3};//output 7
        int res = removeDuplicates(arr);
        System.out.println(res);
    }
}
