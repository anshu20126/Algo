package hundreddayscodeforexperince.code;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KeyValuePairExtractor {
    public static void main(String[] args) {
        String input = "1010 : Anil :| 1011 : Interview";
        Map<String, String> keyValuePairs = extractKeyValuePairs(input);

        // Print the extracted key-value pairs
        for (Map.Entry<String, String> entry : keyValuePairs.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    private static Map<String, String> extractKeyValuePairs(String input) {
        Map<String, String> keyValuePairs = new HashMap<>();

        // Regex pattern to match key-value pairs
        Pattern pattern = Pattern.compile("(\\d+) : (\\w+)");

        // Extract key-value pairs using Matcher and add them to the map
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String key = matcher.group(1);
            String value = matcher.group(2);
            keyValuePairs.put(key, value);
        }

        return keyValuePairs;
    }
}
