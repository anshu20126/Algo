package hundreddayscodeforexperince.code;

import java.util.Arrays;

public class KthLargestElemntFromArray {
    public static void main(String[] args) {
        int arr[] ={6,3,4,8,10,9};
        int k =1;
        int res =largestElement(arr,k);
        System.out.println(res);
    }
    private static int largestElement(int[] arr, int k) {
        int largest;
        Arrays.sort(arr);
        if (k < 1 || k > arr.length) {
            return -1;
        }
        else {
        largest=arr[arr.length-k];
        return largest;
        }
    }
}
