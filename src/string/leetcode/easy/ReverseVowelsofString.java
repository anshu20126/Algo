package string.leetcode.easy;

import java.util.Stack;

//https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
public class ReverseVowelsofString {
    public static String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        //push only vowels into stack
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(String.valueOf(c)))
                stack.push(c);
        }
        //when we encounter a vowel we pop the character from the stack and
        //  append it to the string. just do a dry run you will understand it
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char d = s.charAt(i);
            if (vowels.contains(String.valueOf(d))) {
                res.append(stack.pop());
            } else res.append(d);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String result = reverseVowels(s);
        System.out.println(result);
    }
}
