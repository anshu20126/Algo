package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortSalaryOfEmplye {
    public static void main(String[] args) {
        List<Employee3> emp = new ArrayList<>();
        emp.add(new Employee3("anil", 1, 2000));
        emp.add(new Employee3("kumar", 2, 4000));
        emp.add(new Employee3("singh", 3, 5000));
        emp.add(new Employee3("singhgh", 4, 10000));

        List<Employee3> empSort = emp.stream().sorted(Comparator.comparingInt(Employee3::getSalary).reversed()).collect(Collectors.toList());

        System.out.println(empSort);
    }
}

class Employee3 {
    private String name;
    private int id;
    private int salary;

    public Employee3(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
