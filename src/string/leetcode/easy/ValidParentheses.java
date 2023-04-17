package string.leetcode.easy;
//https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        // String s = "()";
        String s = "()[]{}";
        // String s = "([)[]{}";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
