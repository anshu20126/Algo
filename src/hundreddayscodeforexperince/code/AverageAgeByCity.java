package hundreddayscodeforexperince.code;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private String city;
    private int age;

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}

public class AverageAgeByCity {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Vikas", "Bangalore", 28),
                new Person("Amit", "Delhi", 32),
                new Person("Rahul", "Delhi", 40),
                new Person("Shreya", "Bangalore", 24),
                new Person("Ravi", "Indore", 45)
        );

        Map<String, Double> averageAgeByCity = persons.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.averagingInt(Person::getAge)));

        for (Map.Entry<String, Double> entry : averageAgeByCity.entrySet()) {
            String city = entry.getKey();
            double averageAge = entry.getValue();
            System.out.println("Average age in " + city + ": " + averageAge);
        }
    }
}
