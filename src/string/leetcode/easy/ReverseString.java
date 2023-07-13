package string.leetcode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println("print the char   "  + Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char c = s[start];
            s[start] = s[end];
            s[end] = c;
            start++;
            end--;
        }
    }
}
