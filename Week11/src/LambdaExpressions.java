import java.util.Arrays;
import java.util.Comparator;

public class LambdaExpressions {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John", "Doe", 35, 50000),
                new Employee("Jane", "Doe", 25, 60000),
                new Employee("Bob", "Smith", 40, 45000),
                new Employee("Alice", "Johnson", 30, 55000)
        };

        Arrays.sort(employees, (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        System.out.println("Employees sorted by first name: " + Arrays.toString(employees));

        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("Employees sorted by age: " + Arrays.toString(employees));

        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println("Employees sorted by salary: " + Arrays.toString(employees));
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
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary + "]";
    }

    
}
