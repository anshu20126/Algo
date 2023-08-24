package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaximumOccuranceOfString {
    public static void main(String[] args) {
        //find maximum occurrence of string ?
        //Using java 8
        String[] str = {"AA", "BB", "AA", "CC", "DD", "NM", "AAA", "AAA", "AAA"};//output AAA =3

        //Count the occurrence of string
        Map<String, Long> count = Arrays.stream(str)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //get maximum occurred value
        long maxOccurrence = count.values().stream().max(Long::compare).orElse(0L);

        //get maximum occurred value with string

        Map<String, Long> maxOccurenceMap = count.entrySet().stream()
                .filter(e -> e.getValue() == maxOccurrence)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(" Using java 8 max occurrence string with value  " + maxOccurenceMap);

        //2nd Approach without using java 8

        Map<String,Integer> count1 = new HashMap<>();

        for (String s : str){
            count1.put(s,count1.getOrDefault(s,0)+1);
        }

        int maxOccurrence1=0;
        for (int value :count1.values()){
            maxOccurrence1=Math.max(maxOccurrence1,value);
        }

        Map<String,Integer> maxOccurrenceMap1 = new HashMap<>();
        for (Map.Entry<String,Integer> entry : count1.entrySet()){
            if (entry.getValue()==maxOccurrence1){
                maxOccurrenceMap1.put(entry.getKey(), entry.getValue());            }
        }

        System.out.println(maxOccurrence1);
    }

}
