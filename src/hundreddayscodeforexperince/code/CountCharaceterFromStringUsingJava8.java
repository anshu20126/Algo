package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharaceterFromStringUsingJava8 {
    public static void main(String[] args) {
        String str = "anilanshu";
        Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}
