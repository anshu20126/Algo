package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaEightProgrammingQuestion {
    public static void main(String[] args) {

        //1.java program to count the occurrence of each character in a string
        // ilovejavatechie
        //a=2,c=1,t=1,e=3,v=2,h=1,i=2,j=1,l=1,0=1
        String input = "ilovejavatechie";
        // String[] results = input.split("");
        //System.out.println(Arrays.toString(results));
        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        //2.find all duplicate element from a given string
        List<String> duplicateElement = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateElement);

        //3.find all unique element from a given string
        List<String> uniqueElement = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(uniqueElement);

        //4.find first non repeat  element from a given string
        String firstNonRepeatElement = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println("1st non repeat element " + firstNonRepeatElement);

        //5. java program to find second-highest number from given array
        int[] number = {5, 9, 11, 2, 8, 21, 1};
        Integer secondHighestNumber = Arrays.stream(number).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondHighestNumber);

        //6.java program to find longest string from given array
        String[] strArray = {"java", "techie", "springboot", "microservices"};
        String longestString = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);

        //7. find all element from given array which started from 1
        List<String> stringList = Arrays.stream(number)
                .boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(stringList);

        // 8 String join method
        List<String> nos = Arrays.asList("1", "2", "3", "4");
        //1-2-2-4
        String results1 = String.join(",", nos);
        System.out.println(results1);
    }
}
