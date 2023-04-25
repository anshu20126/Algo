package leetcodeTopInterviewQuestion;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }


    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};//Output: "fl"
        String [] strs1 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs1));
    }
}
