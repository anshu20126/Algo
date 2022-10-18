package array;
/*Write a function called middle that takes a list and returns a new list that contains all but the first and last elements.
        myArray = [1, 2, 3, 4]
       middle(myArray)  # [2,3]*/

import java.util.Arrays;

public class MiddleFunction {
    static int[] middle(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 8, 9};
        System.out.println(Arrays.toString(middle(arrays)));
    }
}
