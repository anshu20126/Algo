package hundreddayscodeforexperince.code;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EmployeeFilterBaseOnNameAndAge {
    public static void main(String[] args) {
        // Create a list of employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anil", 20));
        employees.add(new Employee("John", 25));
        employees.add(new Employee("Anil", 30));
        employees.add(new Employee("Emma", 20));
        employees.add(new Employee("Anil", 20));
        employees.add(new Employee("Anil", 20));

        // Use Java 8 streams to filter and print employees with name "Anil" and age 20
        employees.stream()
                .filter(employee -> employee.getName().equals("Anil") && employee.getAge() == 20)
                .forEach(employee -> System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge()));
    }
}
