package array.leetcode.medium;

import java.util.*;

//https://leetcode.com/problems/3sum/
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};//Output: [[-1,-1,2],[-1,0,1]]
        int [] arr1={0,1,1};//output []
        int [] arr2 ={0,0,0};//[[0,0,0]]
        List<List<Integer>> result = threeSum(arr);
        System.out.println(result);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        if (nums.length==0){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int sum =0;
        for (int i = 0; i <nums.length-2 ; i++) {
            int j = i+1;
            int k = nums.length-1;
            while (j<k){
                sum = nums[i]+nums[j]+nums[k];
                if (sum==0)
                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                if (sum<0)
                    j++;
                else if (sum>0) {
                    k--;

                }
            }

        }
        return new ArrayList<>(set);
    }
}
