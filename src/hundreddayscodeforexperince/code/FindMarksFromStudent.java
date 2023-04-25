package hundreddayscodeforexperince.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindMarksFromStudent {

    public static void main(String[] args) {

        // Create Student objects
        Student s1 = new Student(1, "S1", 81);
        Student s2 = new Student(2, "S2", 95);
        Student s3 = new Student(3, "S3", 70);
        Student s4 = new Student(4, "S4", 88);

        // Add students to a list
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        // Use Java 8 stream to filter students based on marks > 80
        List<Student> filteredStudents = students.stream()
                .filter(s -> s.getMarks() > 80)
                .collect(Collectors.toList());

        // Print the list of filtered students
        System.out.println("Students with marks > 80:");
        filteredStudents.forEach(System.out::println);

        // Use Java 8 stream to calculate the sum of all marks
        int sum = students.stream()
                .mapToInt(Student::getMarks)
                //.mapToInt(s -> s.getMarks())
                .sum();

        // Print the sum of all marks
        System.out.println("Sum of all marks: " + sum);
    }
}

class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
