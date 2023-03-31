package array.leetcode.easy;

public class SumOfArray {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(arr, target));
    }
        private static boolean twoSum(int[] arr, int target) {
        int n= arr.length;

            for (int i = 0; i < n-1; i++) {
                for(int j=i+1;j<n-1;j++){
                    if (arr[i]+arr[j]==target){
                        return true;
                    }
                }
            }
            return false;
    }
}
