package string.leetcode.easy;

import java.util.Stack;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class ReverseWordsStringIII {
    // Approach:
    // Using two pointers, 'start' and 'end', each time 'end' reaches a space, we reverse the words before.
    // To reverse, we convert the String 's' to a char array, then write a method to reverse the char in the array.

    public static String reverseWords(String s) {
        //Convert s into char Array
        char[] chars = s.toCharArray();

        int start = 0;
        int end;
        for (end = 0; end <= chars.length; end++) {
            // When 'end' reaches a space character ' ', reverse the words from 'start' to 'end' - 1 index in 'chars'.
            if (end == chars.length || chars[end] == ' ') {
                reverse(chars, start, end - 1);

                //reset the start for the next word
                start = end + 1;
            }
        }
        return new String(chars);
    }

    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[end];
            chars[end] = chars[start];
            chars[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = "God Ding";
        System.out.println(reverseWords(s1));
    }
}
