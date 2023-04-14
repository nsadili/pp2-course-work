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
        return String.format("%s %d %.2f", firstName, age, salary);
    }
}

public class LambdaExpressions {
    public static void main(String[] args) {
        // Example of passing a lambda expression as an input argument to a method
        System.out.println(applyOperation(2, 3, (a, b) -> a + b)); // prints 5

        // Example of passing a method reference as an input argument to a method
        System.out.println(applyOperation(2, 3, Integer::sum)); // prints 5

        // Example of sorting an array of Employees based on different fields using lambda expressions
        Employee[] employees = {
                new Employee("John", 25, 50000),
                new Employee("Alice", 30, 60000),
                new Employee("Bob", 20, 40000)
        };

        // Sort employees by firstname
        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println(Arrays.toString(employees)); // prints [Alice 30 60000.00, Bob 20 40000.00, John 25 50000.00]

        // Sort employees by age
        Arrays.sort(employees, Comparator.comparing(Employee::getAge));
        System.out.println(Arrays.toString(employees)); // prints [Bob 20 40000.00, John 25 50000.00, Alice 30 60000.00]

        // Sort employees by salary
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary));
        System.out.println(Arrays.toString(employees)); // prints [Bob 20 40000.00, John 25 50000.00, Alice 30 60000.00]
    }

    private static char[] applyOperation(int a, int b, Object calculator) {
        return null;
    }

    // Example of a method that takes in a functional interface as an input argument
    public static double applyOperation(double a, double b, Calculator calculator) {
        return calculator.calculate(a, b);
    }

    // Definition of the Calculator functional interface
    @FunctionalInterface
    interface Calculator {
        double calculate(double a, double b);
    }
}
