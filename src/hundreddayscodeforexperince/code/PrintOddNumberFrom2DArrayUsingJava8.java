package hundreddayscodeforexperince.code;

import java.util.Arrays;

public class PrintOddNumberFrom2DArrayUsingJava8 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[] oddNumbers = Arrays.stream(arr)//convert into single array
                .flatMapToInt(Arrays::stream)//to flatten the stream of arrays to a stream of integers.
                .filter(n -> n % 2 != 0)  //to keep only the odd numbers.
                .toArray(); //to collect the filtered odd numbers into an array.
        System.out.println(Arrays.toString(oddNumbers)); // Output: [1, 3, 5, 7, 9]
    }
}

//int[] oddNumbers =Arrays.stream(arr).flatMapToInt(Arrays::stream).filter(n ->n % 2!=0).toArray();
