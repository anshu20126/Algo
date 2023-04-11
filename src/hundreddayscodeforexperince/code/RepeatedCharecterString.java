package hundreddayscodeforexperince.code;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharecterString {

        public static void main(String[] args) {
            String str = "Hello World";
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();

            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);

                if(map.containsKey(ch)) {
                    int count = map.get(ch);
                    map.put(ch, count+1);
                }
                else {
                    map.put(ch, 1);
                }
            }

            for(Character ch : map.keySet()) {
                int count = map.get(ch);
                if(count > 1) {
                    System.out.println("Character '" + ch + "' repeated " + count + " times.");
                }
            }
        }
    }


    //Map<String, Long> map = Arrays.stream(str.split(""))
       //     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
     //   System.out.println(map);


