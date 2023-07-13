package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplcateIntegerList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 3, 4, 3, 4, 3, 4);

        List<Integer> duplicates = list.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("Duplicate Integers: " + duplicates);
    }
}
