package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfNameUsingJava8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anil", "kumar", "sandeep", "rajesh");

        List<String> sort = list.stream().sorted().collect(Collectors.toList());

        System.out.println(sort);
    }
}
