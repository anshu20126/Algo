package hundreddayscodeforexperince.code;

import java.util.function.Function;

public class StringToIntegerConverter {
    public static void main(String[] args) {
        String str = "123";

        // Using lambda expression
        Function<String, Integer> stringToInt = s -> Integer.parseInt(s);
        int result1 = stringToInt.apply(str);
        System.out.println("Result using lambda expression: " + result1);

        // Using method reference
        Function<String, Integer> stringToInt2 = Integer::parseInt;
        int result2 = stringToInt2.apply(str);
        System.out.println("Result using method reference: " + result2);
    }
}
