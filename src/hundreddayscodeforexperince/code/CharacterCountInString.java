package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountInString {
    public static void main(String[] args) {
        String string ="hello world";

        Map<String,Long> countChar = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("Using Java 8 : "+countChar);

        Map<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i <string.length() ; i++) {
            char c =string.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        System.out.println("Using HashMap: "+hm);


    }
}
