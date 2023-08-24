package hundreddayscodeforexperince.code;

import java.util.Arrays;

public class SwapZeroWithNonZero {
    public static void main(String[] args) {
        int[] input = {0, -1, 5, 0, 7, 8, 0, 0, 9, 0};
        swapNonZero(input);
        System.out.println("Output: " + Arrays.toString(input));
    }

    private static void swapNonZero(int[] arr) {
        int nonZeroIndex = 0;

        //Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        //Fill the rest of the array with zeros
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}
