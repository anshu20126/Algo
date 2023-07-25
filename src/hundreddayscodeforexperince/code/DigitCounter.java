package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class DigitCounter {
    public static void main(String[] args) {
        String str = "this is today date this is date 123 6768 today";
        long count = countDigits(str);
        System.out.println("Number of digits in the string: " + count);
    }
    private static long countDigits(String str) {
        Map<String, Long> countDigit = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return countDigit.entrySet().stream()
                .filter(entry -> entry.getKey().matches(".*\\d.*"))
                .mapToLong(Map.Entry::getValue)
                .sum();
    }
}
