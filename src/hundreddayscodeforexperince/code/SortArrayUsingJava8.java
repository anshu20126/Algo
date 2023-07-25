package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayUsingJava8 {
    public static void main(String[] args) {
        int[] arr = {99, 55, 203, 99, 4, 91};

        int[] sort = Arrays.stream(arr).sorted().toArray();

        System.out.println(Arrays.toString(sort));
    }
}
