import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        // create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Tofig", "Huseynov", 25, 25000),
                new Employee("Riad", "Rustamov", 30, 35000),
                new Employee("Karim", "Karimli", 45, 50000),
                new Employee("Musa", "Mammadov", 50, 60000),
                new Employee("Ayla", "Ramizova", 35, 40000)
        );

        // using lambda expression with Stream.allMatch() method
        boolean allMatch = employees.stream()
                .allMatch(e -> e.getSalary() >= 25000);
        System.out.println("All employees have a salary greater than or equal to 25000: " + allMatch);

        // using lambda expression with Stream.noneMatch() method
        boolean noneMatch = employees.stream()
                .noneMatch(e -> e.getAge() > 60);
        System.out.println("No employee has an age greater than 60: " + noneMatch);

        // using lambda expression with Stream.count() method
        long count = employees.stream()
                .filter(e -> e.getAge() >= 30)
                .count();
        System.out.println("Number of employees with age greater than or equal to 30: " + count);

        // using lambda expression with Stream.generate() and Stream.limit() methods
        Stream.generate(() -> "Hello, World!")
                .limit(5)
                .forEach(System.out::println);

        // using lambda expression with Stream.forEach() method
        employees.stream()
                .forEach(e -> System.out.println(e.getFirstName()));

        // using lambda expression with Stream.findFirst() and Optional.ifPresentOrElse() methods
        Optional<Employee> firstEmployee = employees.stream()
                .filter(e -> e.getSalary() > 40000)
                .findFirst();
        firstEmployee.ifPresentOrElse(
                e -> System.out.println("First employee with a salary greater than 40000: " + e.getFirstName()),
                () -> System.out.println("No employee with a salary greater than 40000 found")
        );

        // using lambda expression with Stream.filter(), Stream.sorted(), Stream.map(), and Stream.collect() methods
        List<String> employeeNames = employees.stream()
                .filter(e -> e.getAge() < 40)
                .sorted(Comparator.comparing(Employee::getAge))
                .map(Employee::getFullName)
                .collect(Collectors.toList());
        System.out.println("Names of employees under 40, sorted by age: " + employeeNames);
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public Employee(String firstName, String lastName, int age, int salary) {
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

    public int getSalary() {
        return salary;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
