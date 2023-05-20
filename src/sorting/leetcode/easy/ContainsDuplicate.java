package sorting.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        HashSet<Integer> hset = new HashSet<>();
        for (int i : nums) {
            if (!hset.add(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(containsDuplicate(nums));
    }
}

