package hundreddayscodeforexperince.code;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersSorted {
    public static void main(String[] args) {
        List<String> list = List.of("1", "4", "3", "2", "5");
        List<Integer> evenNumberSorted = evenNumbersSorted(list);
        System.out.println(evenNumberSorted);
    }

    static List<Integer> evenNumbersSorted(List<String> values) {
        List<Integer> evenNumberSorted = values.stream().map(Integer::parseInt).filter(num -> num % 2 == 0).sorted()
                .collect(Collectors.toList());
        return evenNumberSorted;
    }
}
