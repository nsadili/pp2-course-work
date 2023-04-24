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

public class EmployeeSorter {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Nurlan", "Zeynalli", 25, 50000),
                new Employee("Kerem", "Akturoglu", 30, 60000),
                new Employee("Lionel", "Messi", 20, 40000),
                new Employee("Talisca", "Brown", 35, 70000),
                new Employee("Ramil", "Sheydayev", 28, 55000),
        };

        Arrays.sort(employees, Comparator.comparing(Employee::getLastName));
        System.out.println("Sort by last name: " + Arrays.toString(employees));
        System.out.println("\n");

        Arrays.sort(employees, Comparator.comparing(Employee::getAge));
        System.out.println("Sort by age: " + Arrays.toString(employees));
        System.out.println("\n");

        Arrays.sort(employees, Comparator.comparing(Employee::getSalary));
        System.out.println("Sort by salary: " + Arrays.toString(employees));
    }
}