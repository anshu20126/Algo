package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArraysExample {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry"};
        String[] array2 = {"orange", "grape", "melon"};

        // Convert arrays to streams and concatenate
        Stream<String> stream1 = Arrays.stream(array1);
        Stream<String> stream2 = Arrays.stream(array2);
        Stream<String> mergedStream = Stream.concat(stream1, stream2);

        // Convert merged stream back to array
        String[] mergedArray = mergedStream.toArray(String[]::new);

        // Print merged array
        System.out.println(Arrays.toString(mergedArray));
    }
}
