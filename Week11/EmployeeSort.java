package week11;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeSort {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ulkar", "Ahmadli", 18, 5000),
                new Employee("Tural", "Ahmadli", 34, 60000),
                new Employee("Nijat", "Ahmadli", 33, 70000),
                new Employee("Rovshan", "Ahmadli", 27, 45000)
        };

        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println("Sort by first name:");
        Arrays.stream(employees).forEach(System.out::println);

        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("Sort by age:");
        Arrays.stream(employees).forEach(System.out::println);

        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println("Sort by salary in descending order:");
        Arrays.stream(employees).forEach(System.out::println);
    }
}
