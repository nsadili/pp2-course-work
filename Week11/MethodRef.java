import java.util.Arrays;
import java.util.Comparator;

public class MethodRef {
    public static void main(String[] args) {
        // Lambda expression example
        calculate((a, b) -> a + b, 10, 5); // returns 15

        // Method reference example
        String[] names = {"Ayla", "Murad", "Tofig"};
        Arrays.sort(names, Main::compareByName);
        System.out.println(Arrays.toString(names));

        // Sorting employees based on different fields
        Employee[] employees = {
            new Employee("Ayla", 30, 50000),
            new Employee("Murad", 25, 40000),
            new Employee("Tofig", 35, 60000)
        };

        // Sort by first name
        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println(Arrays.toString(employees));

        // Sort by age
        Arrays.sort(employees, Comparator.comparing(Employee::getAge));
        System.out.println(Arrays.toString(employees));

        // Sort by salary
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary));
        System.out.println(Arrays.toString(employees));
    }

    // Lambda expression example
    public static void calculate(Calculator calculator, double a, double b) {
        double result = calculator.calculate(a, b);
        System.out.println(result);
    }

    // Method reference example
    public static int compareByName(String a, String b) {
        return a.compareTo(b);
    }
}

@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
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
