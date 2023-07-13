package array.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        boolean result =containsDuplicate(nums);
        System.out.println(result);

    }
}
