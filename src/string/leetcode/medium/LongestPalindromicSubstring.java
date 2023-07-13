package string.leetcode.medium;

import java.util.Stack;

//https://leetcode.com/problems/longest-palindromic-substring/?envType=featured-list&envId=top-interview-questions
public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            stack.push(c);
        }
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == stack.pop()){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "babad";//output "bab"
        String s1 ="cbbd";//output "bb"
        System.out.println(longestPalindrome(s1));
    }
}
