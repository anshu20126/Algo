package java8;

import java.util.*;
public class MinSalary {
    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<>();
        list.add(new Employee1("John", 5000));
        list.add(new Employee1("Alice", 6000));
        list.add(new Employee1("Bob", 4500));
        list.add(new Employee1("Eva", 5500));
        list.add(new Employee1("Mike", 4800));

        OptionalDouble minSalary = list.stream().mapToDouble(Employee1::getSalary).min();

        System.out.println("Minimum salary: " + minSalary.getAsDouble());
    }
}

class Employee1 {
    private String name;
    private double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
