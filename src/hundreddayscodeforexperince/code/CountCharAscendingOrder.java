package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharAscendingOrder {
    public static void main(String[] args) {
        String input = "ilovejavatechie";

        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.print(entry.getKey() + "=" + entry.getValue() + ","));
    }
}
