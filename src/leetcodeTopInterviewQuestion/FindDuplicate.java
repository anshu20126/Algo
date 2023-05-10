package leetcodeTopInterviewQuestion;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-duplicate-number/description/
class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>=mid+1)
            {
                start=mid+1;

            }
            else
            {
                end=mid-1;
            }
        }
        return nums[start];


    }

    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        int res = findDuplicate(nums);
        System.out.println(res);
    }
}