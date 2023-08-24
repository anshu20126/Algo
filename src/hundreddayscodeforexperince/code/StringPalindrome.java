package hundreddayscodeforexperince.code;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "JAJ";
        boolean result = palindrome(str);
        System.out.println(result);
    }

    private static boolean palindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /*private static boolean palindrome1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb = sb.append(str.charAt(i));
        }
        return str.equals(sb.toString());
    }*/
}

