package string.leetcode.easy;

//https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75
public class GreatestCommonDivisorStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLenghth = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLenghth);

    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        String str1 = "ABCABC", str2 = "ABC";
        String result = gcdOfStrings(str1, str2);
        System.out.println(result);
    }
}
