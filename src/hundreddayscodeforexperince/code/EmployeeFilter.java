package hundreddayscodeforexperince.code;
//Write a java program for Filtering employees based on salary and adding a bonus to those employees whose salary is more than 50000?
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
    private String name;
    private double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("John", 45000));
        employees.add(new Employee1("Alice", 60000));
        employees.add(new Employee1("Bob", 55000));
        employees.add(new Employee1("Mike", 48000));

        List<Employee1> filteredEmployees = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .peek(e -> e.setSalary(e.getSalary() + 5000)) // Add a bonus of 5000 to each filtered employee
                .collect(Collectors.toList());

       /* for (Employee1 e : employees) {
            if (e.getSalary() > 50000) {
                e.setSalary(e.getSalary() + 5000);
                filteredEmployees.add(e);
            }
        }*/

        // Print the filtered employees
        System.out.println("Filtered Employees:");
        filteredEmployees.forEach(System.out::println);
    }
}
