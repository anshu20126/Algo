package sorting;
//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.

import java.util.HashSet;

public class ConatinsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    /* public static boolean containsDuplicate(int[] nums) {
        // Create a hashset...
        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse all the elements through the loop...
        for (int i = 0; i < nums.length; i ++){
            // Searches hashset. if present, it contains duplicate...
            if (hset.contains(nums[i])){
                return true;
            }
            // if not present it will update hashset...
            hset.add(nums[i]);
        }
        // Otherwise return false...
        return false;
    }*/
    public static boolean containsDuplicate(int[] nums) {
        // Base case...
        if (nums == null || nums.length == 0)
            return false;
        // Create a hashset...
        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse all the elements through the loop...
        for (int i : nums) {
            // If it contains duplicate...
            if (!hset.add(i)) {
                return true;
            }
        }
        // Otherwise return false...
        return false;
    }
}
