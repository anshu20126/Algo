package array;
//https://leetcode.com/problems/contains-duplicate-ii/

import java.util.HashMap;

class ContainDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
       /* //First Solution
        // Base case...
        if(nums == null || nums.length < 2 || k == 0)
            return false;
        int i = 0;
        // Create a Hash Set for storing previous of k elements...
        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse for all elements of the given array in a for loop...
        for(int j = 0; j < nums.length; j++) {
            // If duplicate element is present at distance less than equal to k, return true...
            if(!hset.add(nums[j])){
                return true;
            }
            // If size of the Hash Set becomes greater than k...
            if(hset.size() >= k+1){
                // Remove the last visited element from the set...
                hset.remove(nums[i++]);
            }
        }
        // If no duplicate element is found then return false...
        return false;*/

        //2nd solution
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        //int [] nums ={1,2,3,1};
       //int [] nums ={1,0,1,1};
        int [] nums ={1,2,3,1,2,3};
        //int k =3;
        //int k =1;
       int k =2;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}