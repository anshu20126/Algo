package leetcodeTopInterviewQuestion;

//https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.print(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> intersection = new ArrayList();

        for (int element: nums1) {
            if (map.containsKey(element)) {
                map.replace(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }

        for (int element : nums2) {
            if (map.containsKey(element) && map.get(element) != 0) {
                map.replace(element, map.get(element) - 1);
                intersection.add(element);
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }
}
