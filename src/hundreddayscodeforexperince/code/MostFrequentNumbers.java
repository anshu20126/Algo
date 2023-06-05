package hundreddayscodeforexperince.code;

import java.util.*;

public class MostFrequentNumbers {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 2, 4, 3, 5, 2, 5, 5};
        int[] result = findMostFrequentNumbers(inputArray);
        System.out.println(Arrays.toString(result)); // Output: [2, 5]
    }

    private static int[] findMostFrequentNumbers(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the two numbers with the highest frequency
        int[] result = new int[2];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > max1) {
                max2 = max1;
                max1 = frequency;
                result[1] = result[0];
                result[0] = num;
            } else if (frequency > max2) {
                max2 = frequency;
                result[1] = num;
            }
        }

        return result;
    }
}
