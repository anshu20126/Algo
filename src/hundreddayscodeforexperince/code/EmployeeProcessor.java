package hundreddayscodeforexperince.code;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeProcessor {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 180000, 1),
                new Employee(2, "Bob", 210000, 2),
                new Employee(3, "Charlie", 220000, 1),
                new Employee(4, "Dave", 190000, 2),
                new Employee(5, "Eve", 230000, 3)
        );

        // Find employees with salary greater than 200000
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(e -> e.getSalary() > 200000)
                .collect(Collectors.toList());

        System.out.println("Employees with salary greater than 200000: ");
        highSalaryEmployees.forEach(System.out::println);

        // Increment salary of high-salary employees by 5% and group by deptId
        Map<Integer, List<Employee>> deptWiseHighSalaryEmployees = highSalaryEmployees.stream()
                .peek(e -> e.setSalary(e.getSalary() * 1.05)) // Increase salary by 5%
                .collect(Collectors.groupingBy(Employee::getDeptId));

        System.out.println("\nHigh-salary employees grouped by deptId after 5% increment: ");
        deptWiseHighSalaryEmployees.forEach((deptId, empList) -> {
            System.out.println("Dept " + deptId + ": ");
            empList.forEach(System.out::println);
        });
    }

    private static class Employee {
        private int id;
        private String name;
        private double salary;
        private int deptId;

        public Employee(int id, String name, double salary, int deptId) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.deptId = deptId;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public int getDeptId() {
            return deptId;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", deptId=" + deptId +
                    '}';
        }
    }
}
