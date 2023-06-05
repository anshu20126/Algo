package hundreddayscodeforexperince.code;

import java.util.Arrays;

public class SumOfMaxNumberArray {
    public static void main(String[] args) {
        int[] array = {3, 4, 1, 7, 9, 2};
        System.out.println(sumOfMaxMin(array));

    }

    private static int sumOfMaxMin(int[] array) {
        int sum, secondMin, secondMax;
        //Arrays.sort(array);
        bubbleSort(array);
        secondMax = array[array.length - 2];
        secondMin = array[0] + 1;

        sum = secondMax + secondMin;
        return sum;
    }
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


