package hundreddayscodeforexperince.code;

public class Rotation {

    public static void main(String[] args) {
        String s = "abcde";
        String b = "bcdeba";

        System.out.println(rotation(s, b));
    }

    public static boolean rotation(String a, String b) {
        // Step 1: Check if the lengths of both strings are the same
        if (a.length() != b.length()) {
            return false;
        }

        // Step 2: Concatenate the first string with itself
        String concatenated = a + a;

        // Step 3: Check if the second string is a substring of the concatenated string
        return concatenated.contains(b);
    }
}
