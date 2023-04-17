package hundreddayscodeforexperince.code;

import java.util.Map;
import java.util.HashMap;

public class MaxMinCharCount {
    public static void main(String[] args) {
        String input = "Hello World";

        Map<Character, Integer> charCountMap = new HashMap<>();

        input.chars().mapToObj(c -> (char) c).forEach(c -> charCountMap.merge(c, 1, Integer::sum));

        int maxCount = charCountMap.values().stream().mapToInt(Integer::intValue).max().orElse(0);
        //int minCount = charCountMap.values().stream().mapToInt(Integer::intValue).min().orElse(0);

        System.out.println("Maximum occurring character(s) with count(s):");
        charCountMap.entrySet().stream().filter(entry -> entry.getValue() == maxCount)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

       // System.out.println("Minimum occurring character(s) with count(s):");
       // charCountMap.entrySet().stream().filter(entry -> entry.getValue() == minCount)
        //        .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
