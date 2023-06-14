package array.leetcode.medium;

import java.util.Arrays;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class FindKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int kthLargest = nums[nums.length-k];
        return kthLargest;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};//output =5
        int k = 2;
        // int [] nums1= {3,2,3,1,2,4,5,5,6};
        //int k = 4;
        System.out.println(findKthLargest(nums, k));
    }
}
