package hundreddayscodeforexperince.code;

import java.util.*;

public class FindRepeatedStrings {
    public static void main(String[] args) {
        String[] strings = {"apple", "orange", "banana", "apple", "grape", "banana", "pear"};

        // Create a HashMap to store the count of each string
        Map<String, Integer> stringCounts = new HashMap<>();

        // Loop through the array of strings and increment the count in the HashMap for each string
        for (String s : strings) {
            if (stringCounts.containsKey(s)) {
                stringCounts.put(s, stringCounts.get(s) + 1);
            } else {
                stringCounts.put(s, 1);
            }
        }

        // Loop through the HashMap and print the strings and their counts
        for (Map.Entry<String, Integer> entry : stringCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }
}
