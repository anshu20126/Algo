package hundreddayscodeforexperince.code;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Character> charMap = new HashMap<>();
        Map<Character, Boolean> usedChars = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (charMap.containsKey(c1)) {
                if (charMap.get(c1) != c2) {
                    return false;
                }
            } else {
                if (usedChars.containsKey(c2)) {
                    return false;
                }

                charMap.put(c1, c2);
                usedChars.put(c2, true);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "AABBCD";
        String s2 = "NNMMKL";

        boolean isIsomorphic = isIsomorphic(s1, s2);
        System.out.println("Isomorphic: " + isIsomorphic);
    }
}
