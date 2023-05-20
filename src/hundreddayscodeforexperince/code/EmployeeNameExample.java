package hundreddayscodeforexperince.code;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNameExample {
    public static void main(String[] args) {
        List<Employee2> employees = new ArrayList<>();
        employees.add(new Employee2(1, "John", 50000));
        employees.add(new Employee2(2, "Jane", 60000));
        employees.add(new Employee2(3, "John", 70000));
        employees.add(new Employee2(4, "Mary", 55000));
        employees.add(new Employee2(5, "John", 45000));

        Map<String, List<Employee2>> employeesByName = employees.stream()
                .collect(Collectors.groupingBy(Employee2::getName));

        List<String> sameNameEmployees = employeesByName.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Employees with the same name: " + sameNameEmployees);

        for (String name : sameNameEmployees) {
            List<Integer> salaries = employeesByName.get(name).stream()
                    .map(Employee2::getSalary)
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Salaries of employees named " + name + ": " + salaries);
        }
    }
}

class Employee2 {
    private final int id;
    private final String name;
    private final int salary;

    public Employee2(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
