package sorting.leetcode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/description/
public class MergedSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = nums1.length; //3,
        int[] nums2 = {2, 5, 6};
        int n = nums2.length; //3
       merge(nums1, m, nums2, m);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = 0;
        while(m<nums1.length){
            nums1[m++]=nums2[c++];
        }
        Arrays.sort(nums1);
       // System.out.println(Arrays.toString(nums1));
    }
}
