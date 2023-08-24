package java8;

import java.util.Arrays;
import java.util.Comparator;

public class MaxAndSecondMax {
    public static void main(String[] args) {

        int[] arr = {11, 44, 77, 99, 88, 55, 88, 99, 77, 77};

        Integer secondA = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);

        Integer third = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(null);

        System.out.println(secondA);

        System.out.println(third);
    }
}