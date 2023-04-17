package string.leetcode.easy;

//https://leetcode.com/problems/valid-palindrome/description/
class ValidPalindrone {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        s = s.replaceAll("\\s", "");
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        for (int i = 0; i <= s.length() / 2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}