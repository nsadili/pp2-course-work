package Week11.ex05;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSorter {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Sadiq", "Mammadov", 25, 3000),
            new Employee("Ayxan", "Hasanov", 30, 3500),
            new Employee("Ali", "Muradov", 22, 2500),
        };

        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println("Sorted by firstname:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("Sorted by age:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Sorted by salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (age: " + age + ", salary: " + salary + ")";
    }
}

