package hundreddayscodeforexperince.code;

import java.util.List;

public class MaxMinFinder {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 5, 1, 7, 2, 8, 4, 6);

        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        //using java 8
//List<Integer> numbers = Arrays.asList(3, 5, 1, 7, 2, 8, 4, 6);

        //  int max = numbers.stream().max(Integer::compareTo).get();
        //  int min = numbers.stream().min(Integer::compareTo).get();

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);



    }
}
