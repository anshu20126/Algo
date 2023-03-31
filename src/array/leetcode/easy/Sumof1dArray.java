package array.leetcode.easy;
//https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class Sumof1dArray {
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
