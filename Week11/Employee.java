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

    public String toString() {
        return "Employee[firstName=" + firstName + ", age=" + age + ", salary=" + salary + "]";
    }
}

public class Employee {
    public static void Employee(String[] args) {
        Employee[] employees = {
                new Employee("Alice", 35, 50000),
                new Employee("Bob", 25, 40000),
                new Employee("Charlie", 40, 60000),
                new Employee("Dave", 30, 45000)
        };

        // Sort employees by first name (using a lambda expression)
        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println("Sorted by first name:");
        Arrays.stream(employees).forEach(System.out::println);

        // Sort employees by age (using a method reference)
        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("\nSorted by age:");
        Arrays.stream(employees).forEach(System.out::println);

        // Sort employees by salary (using an anonymous inner class)
        Arrays.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });
        System.out.println("\nSorted by salary:");
        Arrays.stream(employees).forEach(System.out::println);
    }
}
