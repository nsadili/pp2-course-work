package ex7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class StreamAPIDemo {
    public static void main(String[] args) {
        // 1. Filter out even numbers and print the result
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        // 2. Filter out persons whose age is greater than 30 and city is "Baku"
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25, "Baku"),
                new Person("Bob", 35, "Baku"),
                new Person("Charlie", 40, "London")
        );
        persons.stream()
                .filter(person -> person.getAge() > 30 && person.getCity().equals("Baku"))
                .forEach(System.out::println);

        // 3. Map each string to its length and find the sum of all lengths
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        int sumOfLengths = strings.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("Sum of lengths: " + sumOfLengths);

        // 4. Sort the list of persons by age in ascending order and then by name in alphabetical order
        persons.sort(
                Comparator.comparingInt(Person::getAge)
                          .thenComparing(Person::getName)
        );
        System.out.println("Sorted persons: " + persons);

        // 5. Find the average of a list of doubles
        List<Double> doubles = Arrays.asList(1.5, 2.3, 3.7, 4.2, 5.9);
        double average = doubles.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average: " + average);

        // 6. Filter out strings that start with the letter "A" and convert the remaining strings to uppercase
        
        List<String> filteredStrings = strings
        .stream()
        .filter(str -> !str.startsWith("A"))
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println("Filtered and uppercase strings: " + filteredStrings);
    // 7. Filter out employees whose department is "HR" and salary is less than 1000 AZN, then calculate the total salary
    List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 800),
            new Employee("Bob", "IT", 1200),
            new Employee("Charlie", "HR", 1500)
    );
    double totalSalary = employees.stream()
            .filter(emp -> emp.getDepartment().equals("HR") && emp.getSalary() < 1000)
            .mapToDouble(Employee::getSalary)
            .sum();
    System.out.println("Total salary of filtered employees: " + totalSalary);

    // 8. Find the maximum value in the list of integers
    List<Integer> integerList = Arrays.asList(10, 20, 30, 40, 50);
    int maxNumber = integerList.stream()
            .max(Integer::compare)
            .orElse(0);
    System.out.println("Maximum number: " + maxNumber);

    // 9. Find the first string that contains the word "apple"
    String firstStringContainingApple = strings.stream()
            .filter(str -> str.contains("apple"))
            .findFirst()
            .orElse("");
    System.out.println("First string containing 'apple': " + firstStringContainingApple);

    // 10. Collect all persons into a map where the key is the person's name and the value is the person object
    Map<String, Person> personMap = persons.stream()
            .collect(Collectors.toMap(Person::getName, person -> person));
    System.out.println("Person map: " + personMap);
}
}