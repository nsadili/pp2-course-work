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

class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John", 30, 5000),
                new Employee("Jane", 25, 6000),
                new Employee("Mike", 35, 4000)
        };

        // Sort by first name using lambda expression
        sortByField(employees, (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        System.out.println("Sorted by first name:");
        printEmployees(employees);

        // Sort by age using method reference
        sortByField(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("Sorted by age:");
        printEmployees(employees);

        // Sort by salary using anonymous inner class
        sortByField(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });
        System.out.println("Sorted by salary:");
        printEmployees(employees);
    }

    private static void sortByField(Employee[] employees, Comparator<Employee> comparator) {
        Arrays.sort(employees, comparator);
    }

    private static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
    }
}
