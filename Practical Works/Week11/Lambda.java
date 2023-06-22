package Week11;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
    private String firstName;
    private int age;
    private double salary;

    public Employee(String firstName, int age, double salary) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class Lambda {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Yusif", 30, 5000.0),
                new Employee("Fidan", 25, 6000.0),
                new Employee("Sardar", 35, 4000.0)
        };

        // Sort employees based on firstname
        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println("Sorted by firstname: " + Arrays.toString(employees));

        // Sort employees based on age in ascending order
        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("Sorted by age: " + Arrays.toString(employees));

        // Sort employees based on salary in descending order
        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println("Sorted by salary: " + Arrays.toString(employees));
    }
}

