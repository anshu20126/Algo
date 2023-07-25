package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountOfFirstCharcaterInString {
    public static void main(String[] args) {
        String str = "anilkumaranshubangalorekarnatkaindia";
        Map<String,Long> count = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new,Collectors.counting()));

        long occuranceOfA=count.getOrDefault("a",0L);

        System.out.println(occuranceOfA);
    }
}
