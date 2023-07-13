package hundreddayscodeforexperince.code;

import java.util.Arrays;

public class ReverseArrayBasedOnChunk {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversedArray = reverseArray(inputArray);
        System.out.println(Arrays.toString(reversedArray));
    }

    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            if (i % 3 == 2) {
                reversed[i] = arr[i - 2];
                reversed[i - 1] = arr[i - 1];
                reversed[i - 2] = arr[i];
            }
        }

        if (length % 3 != 0) {
            for (int i = length - 1; i >= 0; i--) {
                if (i % 3 == 0) {
                    int groupStart = i - (i % 3);
                    int remainingElements = length - groupStart;
                    int swapCount = Math.min(remainingElements, 3);

                    for (int j = 0; j < swapCount; j++) {
                        reversed[groupStart + j] = arr[i - j];
                    }

                    i -= swapCount - 1;
                }
            }
        }
        return reversed;
    }
}
