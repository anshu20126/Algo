package stackandqueue.leetcode.easy;

import java.util.Stack;

//https://leetcode.com/problems/remove-outermost-parentheses/
public class RemoveOutermostParentheses {
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='('){
                if (stack.size()>0){
                    sb.append(s.charAt(i));
                }
                stack.push(s.charAt(i));
            }else {
                stack.pop();
                if (stack.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
    String s = "(()())(())";//output ="()()()"
    //String s ="(()())(())(()(()))";//output ="()()()()(())"
    //String s= "()()";//output =""
        System.out.println(removeOuterParentheses(s));
    }
}
