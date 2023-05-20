package hundreddayscodeforexperince.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp1 {
    private String name;
    private String gender;

    public Emp1(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", gender=" + gender + "]";
    }
}

public class EmployeeGrouping {
    public static void main(String[] args) {
        List<Emp1> employees = new ArrayList<>();
        employees.add(new Emp1("John", "Male"));
        employees.add(new Emp1("Alice", "Female"));
        employees.add(new Emp1("Bob", "Male"));
        employees.add(new Emp1("Mike", "Male"));
        employees.add(new Emp1("Emily", "Female"));

        // Group employees based on gender and count male employees
        Map<String, Long> genderCount = employees.stream()
                .collect(Collectors.groupingBy(Emp1::getGender, Collectors.counting()));

        // Print the count of male employees
        Long maleCount = genderCount.getOrDefault("Male", 0L);
        System.out.println("Count of Male Employees: " + maleCount);
    }
}
