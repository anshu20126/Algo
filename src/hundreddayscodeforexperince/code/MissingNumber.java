package hundreddayscodeforexperince.code;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
       int [] arr = {1,2,3,5,6,7,8,9};
       int missingNumber =missingNumber(arr);
       System.out.println("Missing Number bhai mil ja: " + missingNumber);
    }
    public static int missingNumber(int [] arr){
        int n = arr.length;
        int totalNumber =n*(n+1)/2;
        int sum =0;
        for (int i = 0; i <n-1 ; i++) sum += arr[i];
       // int sum = Arrays.stream(arr, 0, arr.length - 1).sum();
        return totalNumber-sum;
    }
}
