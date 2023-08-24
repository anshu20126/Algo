package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employe2 {
    private int id;
    private String name;
    private double salary;
    private String rating;
    private int departmentId;

    public Employe2(int id, String name, double salary, String rating, int departmentId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rating = rating;
        this.departmentId = departmentId;
    }

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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}

class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
}

class SalaryIncrementByDepartmnet {
    public static void main(String[] args) {
        List<Employe2> employees = createEmployeeList1();
        List<Department> departments = createDepartmentList();

        Map<Integer, String> departmnetNameMap = departments.stream()
                .collect(Collectors.toMap(Department::getId, Department::getName));

        List<Employe2> updateEmployees = employees.stream()
                .filter(emp -> "Good".equals(emp.getRating()))
                .peek(emp -> emp.setSalary(emp.getSalary() * 1.1))
                .collect(Collectors.toList());

        updateEmployees.forEach(emp -> {
            String deptName = departmnetNameMap.get(emp.getDepartmentId());
            System.out.println(emp.getName() + "in" + deptName + "department has received salry increment");
        });
    }

    private static List<Employe2> createEmployeeList1() {
        // Create and return a list of employees (for demonstration purpose)
        List<Employe2> employees = new ArrayList<>();
        // Add employee data to the list
        return employees;
    }

    private static List<Department> createDepartmentList() {
        // Create and return a list of departments (for demonstration purpose)
        List<Department> departments = new ArrayList<>();
        // Add department data to the list
        return departments;
    }
}
