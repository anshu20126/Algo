package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(11, 12, 23, 34, 25, 5, 77);
        Integer minimumNumber = list1.stream().min(Integer::compareTo).orElse(null);
        System.out.println(minimumNumber);
    }
}
