package hundreddayscodeforexperince.code;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(Integer i = 0; i <s.length(); i ++) {
            if(map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "AABBCD";
        String t = "NNMMKL";

        boolean isIsomorphic = isIsomorphic(s,t);
        System.out.println("Isomorphic: " + isIsomorphic);
    }
}
