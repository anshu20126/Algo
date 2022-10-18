package sorting;
//https://leetcode.com/problems/maximum-product-of-three-numbers/

import java.util.Arrays;

public class MaximumProductOfThreeNumber {
    public static void main(String[] args) {
        // int [] arr = {1,2,3,10,11,20 };
        int[] arr = {3, 4, 5};
        System.out.println(maximumProductOfThreeNumber(arr));
    }

    private static int maximumProductOfThreeNumber(int[] arr) {
      /*
        //First solution
        int n =arr.length;
       Arrays.sort(arr);
        int max = arr[n-1]*arr[n-2]*arr[n-3];
        return max;
    }
    //2nd solution
    Arrays.sort(nums);
    int product = 1;

    for(int i=nums.length-1;i>=nums.length-3;i--){
        product = product * nums[i];
    }
    return product;
}

    */
        //3rd solution
        int n = arr.length;
        Arrays.sort(arr);
        int min = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int max = arr[0] * arr[1] * arr[n - 1];

        return Math.max(min, max);
    }
}
