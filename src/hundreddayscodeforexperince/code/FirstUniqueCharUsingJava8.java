package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharUsingJava8 {
    public static void main(String[] args) {
        String s = "java is good language";

        String firstchar = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
        System.out.println(firstchar);
    }
}
