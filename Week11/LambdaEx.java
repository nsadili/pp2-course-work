import java.util.Arrays;
import java.util.Comparator;

public class LambdaEx {
    
    public static void main(String[] args) {
        

        Employee[] employees = {
            new Employee("Javid", 17, 700),
            new Employee("Cavan", 32, 450),
            new Employee("Nihat", 28, 500)
        };
        

        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println("Employees sorted by first name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        
     
        Arrays.sort(employees, Comparator.comparing(Employee::getAge));
        System.out.println("\nEmployees sorted by age:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        
    
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary));
        System.out.println("\nEmployees sorted by salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
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
    
    public String toString() {
        return firstName + " (Age: " + age + ", Salary: " + salary + ")";
    }
}