package binarysearch;

import java.util.Arrays;

public class ReturnMiddleElementSameAndMultiplyAnotherIntoTwo {
    public static void main(String[] args) {
        int n = 2;
        int[] intArray = {1, 2, 3};
        System.out.println(Arrays.toString(returnMiddleElementAsSame(intArray, n)));
    }

    private static int[] returnMiddleElementAsSame(int[] arr, int n) {
        int[] arr1 = new int[n];
        int start = 0;
        int end = arr.length - 1;
        int mid = start + end / 2;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mid) {
                arr1[n - 1] = arr1[i] + mid;
            } else
                arr1[n - 1] = arr[i] * 2;
        }
        return arr1;
    }
}






