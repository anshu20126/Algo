package java8;

import java.util.*;
import java.util.stream.Collectors;
public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getters and Setters (not shown for brevity)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "John", 5000, "HR"));
        list.add(new Employee(2, "Alice", 6000, "Finance"));
        list.add(new Employee(3, "Bob", 7000, "HR"));
        list.add(new Employee(4, "Eva", 5500, "IT"));
        list.add(new Employee(5, "Mike", 7500, "Finance"));
        list.add(new Employee(6, "Sophia", 8000, "IT"));

        // Calculate total salary for each department using groupingBy and summingDouble collectors
        Map<String, Double> departmentSalarySumMap = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));

        System.out.println("Total salary paid by the company to each department:");
        departmentSalarySumMap.forEach((department, totalSalary) -> System.out.println(department + ": " + totalSalary));

        // Find the department earning the highest total salary
        String highestEarningDepartment = departmentSalarySumMap.entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("\nDepartment earning the highest salary: " + highestEarningDepartment);
    }
}
