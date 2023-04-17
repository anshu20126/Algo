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
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return (checkPalindrome(s, i, j - 1) || checkPalindrome(s, i + 1, j));
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean checkPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
