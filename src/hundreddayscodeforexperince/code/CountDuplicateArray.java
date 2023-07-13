package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateArray {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 3, 1, 1, 2, 6, 6, 8, 8};

        Map<Integer, Long> count = Arrays.stream(arr).boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int count1 = 0;

        for (Map.Entry<Integer, Long> entry : count.entrySet()) {
            if (entry.getValue() > 1) {
                count1++;
            }
        }
        System.out.println("Duplicate Count "+ count1);
    }
}
