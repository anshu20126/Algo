package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class MostPopular{
    public static void main(String[] args) {
        ///List<Employe> list = new ArrayList<>();

       // list.add(new Employe("Anil"));

        List<String> list= Arrays.asList("Anil",null,"Anshu","Anil","kumar","Anil","Kumar");


        Map<String,Long> nameCount = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Long maxCount =nameCount.values().stream().max(Long::compare).orElse(0L);

        Map<String,Long> answer = nameCount
                .entrySet()
                .stream()
                .filter(e->e.getValue()==maxCount)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
    }
}