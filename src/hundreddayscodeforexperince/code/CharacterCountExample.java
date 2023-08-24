package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anil", "anshu", "kumar");

        Map<String,Long> nameCharacterCount = list.stream()
                                 .collect(Collectors.toMap(Function.identity(),name -> (long) name.length()));

        System.out.println(nameCharacterCount);
    }
}
