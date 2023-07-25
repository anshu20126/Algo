package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivideByThree {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 4, 5, 0, 6, 6, 7);
        int n = 3;
        System.out.println(divideByThree(list, n));
    }

    private static List<Integer> divideByThree(List<Integer> list, int n) {
        List<Integer> divideByThree = list.stream().distinct().filter(e -> e != 0 && e % n == 0).collect(Collectors.toList());
        return divideByThree;
    }
}
