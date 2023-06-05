package string.leetcode.easy;

import java.util.Arrays;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";//Output: "apbqcr"
        //String word1 = "ab", word2 = "pqrs";//Output: "apbqrs
        String result = mergeAlternately(word1, word2);
        System.out.println(result);
    }
}
