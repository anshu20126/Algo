package stackandqueue.leetcode.medium;

import java.util.Stack;

//https://leetcode.com/problems/removing-stars-from-a-string/?envType=study-plan-v2&envId=leetcode-75
public class RemovingStarsFromaString {
    public static void main(String[] args) {
      String  s = "leet**cod*e";
      String s1 ="erase*****";
      String result = removeStars(s1);
      System.out.println(result);
    }
    public static String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '*') {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}
