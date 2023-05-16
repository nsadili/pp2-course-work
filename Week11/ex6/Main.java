package ex6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
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
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Instantiating and initializing a Stream
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        Stream<String> nameStream = names.stream();

        // allMatch / noneMatch
        boolean allNamesStartWithA = nameStream.allMatch(name -> name.startsWith("A"));
        System.out.println("All names start with 'A': " + allNamesStartWithA);

        nameStream = names.stream(); // Reset the stream

        boolean noNameContainsZ = nameStream.noneMatch(name -> name.contains("Z"));
        System.out.println("No name contains 'Z': " + noNameContainsZ);

        // count
        long namesStartingWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println("Number of names starting with 'A': " + namesStartingWithA);

        // generate / limit
        Stream<Integer> numberStream = Stream.generate(() -> 1).limit(5);
        numberStream.forEach(System.out::println);

        // forEach
        names.stream().forEach(System.out::println);

        // findFirst / findAny
        Optional<String> firstMatch = names.stream().findFirst();
        firstMatch.ifPresentOrElse(
                name -> System.out.println("First match: " + name),
                () -> System.out.println("No match found.")
        );

        // filter / sorted / collect / map
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25, 5000),
                new Employee("Bob", 30, 6000),
                new Employee("Charlie", 35, 7000)
        );

        List<String> filteredNames = employees.stream()
                .filter(emp -> emp.getSalary() > 5500)
                .sorted((emp1, emp2) -> emp1.getName().compareTo(emp2.getName()))
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("Filtered and sorted employee names with salary > 5500: " + filteredNames);
    }
}
