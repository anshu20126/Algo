package string.leetcode.easy;
//https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalind2 {
    public static void main(String[] args) {
       // String str = "abcba";//true
        String s = "abca";//output true
        //Explanation: You could delete the character 'c'.
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return (checkPalindrome(s, start, end - 1) || checkPalindrome(s, start + 1, end));
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean checkPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
