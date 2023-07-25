package hundreddayscodeforexperince.code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondLargestUsingJavaEight {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 21, 3, 41, 15));
        Integer secondLargest = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        if (secondLargest != null) {
            System.out.println("Second largest element  " + secondLargest);
        } else {
            System.out.println("not found");
        }
    }
}
