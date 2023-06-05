package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> oddInteger = list.stream()
                .filter(e -> e % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(oddInteger);
    }
}
