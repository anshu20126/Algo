package hundreddayscodeforexperince.code;

import java.util.Arrays;

public class RemoveDuplicatesAndSort {
    public static String removeDuplicatesAndSort(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j <chars.length ; j++) {
                if (chars[i] != chars[j]) {
                    sb.append(chars[i]);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "tgaAfee";
        String output = removeDuplicatesAndSort(input);
        System.out.println(output);  // prints "aefgt"
    }
}
