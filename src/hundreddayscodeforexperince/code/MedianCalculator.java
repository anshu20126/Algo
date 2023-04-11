package hundreddayscodeforexperince.code;

import java.util.Arrays;

public class MedianCalculator {
    public static double findMedian(int[] arr) {
        // sort the array
        Arrays.sort(arr);

        int n = arr.length;
        double median;
        
        if (n % 2 == 0) {
            // if the array length is even, average the middle two values
            median = (double)(arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
        } else {
            // if the array length is odd, the median is the middle value
            median = (double)arr[n / 2];
        }
        
        return median;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        double median = findMedian(arr);
        System.out.println("Median of array " + Arrays.toString(arr) + " is " + median);
    }
}
