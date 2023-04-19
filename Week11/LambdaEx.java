package Week11;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaEx {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Nijat", 30, 50000),
                new Employee("Aykhan", 25, 60000),
                new Employee("Kyle", 35, 45000),
                new Employee("Huseyn", 27, 55000)
        };
        
        // Sort by first name
        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println("Sorted by first name: " + Arrays.toString(employees));
        
        // Sort by age
        Arrays.sort(employees, Comparator.comparing(Employee::getAge));
        System.out.println("Sorted by age: " + Arrays.toString(employees));
        
        // Sort by salary
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary));
        System.out.println("Sorted by salary: " + Arrays.toString(employees));
    }
}

class Employee {
    private String firstName;
    private int age;
    private int salary;
    
    public Employee(String firstName, int age, int salary) {
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
    
    public int getSalary() {
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

