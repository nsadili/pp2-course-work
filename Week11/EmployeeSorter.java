package Ex5;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSorter {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ilqar", "Malikov", 25, 50000.0),
                new Employee("Farid", "Ibadov", 35, 75000.0),
                new Employee("Ramil", "Khaspoladov", 30, 60000.0)
        };

        Arrays.sort(employees, (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));

        System.out.println("Sorted by first name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));

        System.out.println("Sorted by age:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();

        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
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

    public String getLastName() {
        return lastName;
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
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
