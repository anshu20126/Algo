package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEmplyeeSalryByDept {
    private String name;
    private String dept;
    private int salary;

    public FindEmplyeeSalryByDept(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class SampleDrive {
    public static void main(String[] args) {
        List<FindEmplyeeSalryByDept> list = createEmployeeList();

        Map<String, List<FindEmplyeeSalryByDept>> employeesByDept = list.stream()
                .collect(Collectors.groupingBy(FindEmplyeeSalryByDept::getDept));

        List<FindEmplyeeSalryByDept> filterEmployee = employeesByDept.values().stream().
                flatMap(List::stream).
                filter(emp -> emp.getSalary() > 10000)
                .collect(Collectors.toList());

        System.out.println(filterEmployee);
    }

    private static List<FindEmplyeeSalryByDept> createEmployeeList() {
        // Create and return a list of employees (for demonstration purpose)
        List<FindEmplyeeSalryByDept> list = new ArrayList<>();
        list.add(new FindEmplyeeSalryByDept("Anil", "IT", 10000));
        list.add(new FindEmplyeeSalryByDept("Anshu", "Soft", 12000));
        list.add(new FindEmplyeeSalryByDept("Kumar", "Tech", 1000));
        list.add(new FindEmplyeeSalryByDept("Vivek", "Java", 5000));

        return list;
    }
}
