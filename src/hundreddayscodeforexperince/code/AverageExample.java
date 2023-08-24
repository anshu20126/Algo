package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.List;

public class AverageExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double averageValue = calculateAverage(list);
        System.out.println("Average: " + averageValue);
    }

    private static double calculateAverage(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        return (double) sum / list.size();
    }
}
