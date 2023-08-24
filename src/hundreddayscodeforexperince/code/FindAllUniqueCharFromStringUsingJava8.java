package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllUniqueCharFromStringUsingJava8 {
    public static void main(String[] args) {
        String str = "aabbcccdeeffghi";

        String nonRepeatingChars = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining());

        System.out.println(nonRepeatingChars);
    }
}
