package string.leetcode.medium;

import java.util.Stack;

//https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
public class ReverseWordsString {
    /*   public static String reverseWords(String s) {
           StringBuilder sb = new StringBuilder();
           String[] array = s.split(" ");

           for (int i = array.length - 1; i >= 0; i--) {
               if (!array[i].isEmpty()) {
                   sb.append(array[i]);
                   sb.append(" ");
               }
           }

           return sb.toString().trim();
       }*/
    public static String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        for (String a : s.trim().split(" ")) {
            if (!a.isEmpty())
                st.push(a);
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String s1 = "  hello world  ";
        String s2 = "a good   example";
        String res = reverseWords(s);
        System.out.println(res);
    }
}
