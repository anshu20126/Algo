package hundreddayscodeforexperince.code;

import java.util.*;

public class AnagramGrouping {
    public static void main(String[] args) {
        String[] s = {"CARS", "REPAID", "DUES", "NOSE", "SIGNED", "LANE", "PAIRED", "ARCS", "GRAB", "USED", "ONES", "BRAG", "SUED", "LEAN", "SCAR", "DESIGN"};

        Map<String, List<String>> anagramGroups = groupAnagrams(s);

        for (List<String> group : anagramGroups.values()) {
            System.out.println(group);
        }
    }

    public static Map<String, List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strings) {
            // Step 1: Sort the characters of the string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            // Step 2: Group anagrams based on their sorted forms
            if (!anagramGroups.containsKey(sortedStr)) {
                anagramGroups.put(sortedStr, new ArrayList<>());
            }
            anagramGroups.get(sortedStr).add(str);
        }

        return anagramGroups;
    }
}
