package array.leetcode.easy;

//https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[count] = nums[j];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println(result);
    }
}
