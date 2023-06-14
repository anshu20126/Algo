/*
package hundreddayscodeforexperince.code;


import javax.xml.validation.Validator;

public class SpecifiedFieldsValidation {
    public static void main(String[] args) {
        // Create an instance of the ValidatorFactory
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        // Create an Employee object to validate
        Employee employee = new Employee();
        employee.setId(0);
        employee.setName("");
        employee.setSalary(-1000.0);
        employee.setEmail("invalid.email@example");

        // Validate the Employee object
        Set<ConstraintViolation<Employee>> violations = validator.validate(employee);

        // Check for validation errors
        if (!violations.isEmpty()) {
            for (ConstraintViolation<Employee> violation : violations) {
                System.out.println(violation.getPropertyPath() + ": " + violation.getMessage());
            }
        }
    }
}


class Employee {
    @Min(value = 1, message = "ID must be a positive integer")
    private int id;

    @NotBlank(message = "Name is required")
    private String name;

    @DecimalMin(value = "0.0", inclusive = false, message = "Salary must be a positive number")
    private double salary;

    @Pattern(regexp = "[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}",
            message = "Invalid email format")
    private String email;

    // Constructors, getters, and setters


    public Employee(int id, String name, double salary, String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Custom validation for email field (optional)
    public boolean isEmailValid() {
        // Custom validation logic if needed
        return true;
    }
}
*/
