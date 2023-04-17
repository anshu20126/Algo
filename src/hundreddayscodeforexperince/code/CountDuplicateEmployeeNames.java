package hundreddayscodeforexperince.code;

import java.util.*;

public class CountDuplicateEmployeeNames {
    public static void main(String[] args) {
        // create a list of employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 25));
        employees.add(new Employee(2, "Bob", 30));
        employees.add(new Employee(3, "Alice", 27));
        employees.add(new Employee(4, "Charlie", 35));
        employees.add(new Employee(5, "David", 28));
        employees.add(new Employee(6, "Charlie", 33));
        employees.add(new Employee(7, "Alice", 26));

        // create a hashmap to count the number of occurrences of each name
        Map<String, Integer> nameCounts = new HashMap<>();
        for (Employee emp : employees) {
            nameCounts.put(emp.getName(), nameCounts.getOrDefault(emp.getName(), 0) + 1);
        }

        // count the number of employee objects with a name that occurs more than once
        int numDuplicates = 0;
        for (Employee emp : employees) {
            if (nameCounts.get(emp.getName()) > 1) {
                numDuplicates++;
            }
        }

        System.out.println("Number of employee objects with duplicate names: " + numDuplicates);
    }

    static class Employee {
        private int id;
        private String name;
        private int age;

        public Employee(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }
    }
}
