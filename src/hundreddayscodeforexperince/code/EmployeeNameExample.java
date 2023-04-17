package hundreddayscodeforexperince.code;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNameExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 50000));
        employees.add(new Employee(2, "Jane", 60000));
        employees.add(new Employee(3, "John", 70000));
        employees.add(new Employee(4, "Mary", 55000));
        employees.add(new Employee(5, "John", 45000));

        Map<String, List<Employee>> employeesByName = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName));

        List<String> sameNameEmployees = employeesByName.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Employees with the same name: " + sameNameEmployees);

        for (String name : sameNameEmployees) {
            List<Integer> salaries = employeesByName.get(name).stream()
                    .map(Employee::getSalary)
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Salaries of employees named " + name + ": " + salaries);
        }
    }
}

class Employee {
    private final int id;
    private final String name;
    private final int salary;

    public Employee(int id, String name, int salary) {
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
