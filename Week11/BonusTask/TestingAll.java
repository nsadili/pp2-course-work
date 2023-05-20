package BonusTask;

import java.util.*;
import java.util.stream.Collectors;


public class TestingAll {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        List<Person> persons = Arrays.asList(
                new Person("John", 25, "Baku"),
                new Person("Alice", 35, "Baku"),
                new Person("Mike", 40, "New York"),
                new Person("Sarah", 30, "Baku")
        );
        List<Person> filteredPersons = persons.stream()
                .filter(p -> p.getAge() > 30 && p.getCity().equals("Baku"))
                .collect(Collectors.toList());
        System.out.println("Filtered persons: " + filteredPersons);

        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        int sumOfLengths = strings.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("Sum of string lengths: " + sumOfLengths);

        List<Person> personList = Arrays.asList(
                new Person("John", 25, "Baku"),
                new Person("Alice", 35, "Baku"),
                new Person("Mike", 40, "New York"),
                new Person("Sarah", 30, "Baku")
        );
        List<Person> sortedPersons = personList.stream()
                .sorted(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName))
                .collect(Collectors.toList());
        System.out.println("Sorted persons: " + sortedPersons);

        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
        double average = doubles.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
        System.out.println("Average: " + average);

        List<String> stringList = Arrays.asList("apple", "banana", "avocado");
        List<String> filteredStrings = stringList.stream()
        .filter(s -> s.startsWith("A"))
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println("Filtered strings: " + filteredStrings);

        List<Employee> employees = Arrays.asList(
          new Employee("John", "HR", 800),
          new Employee("Alice", "Finance", 1200),
          new Employee("Mike", "HR", 1500),
          new Employee("Sarah", "Sales", 2000)
        );
        double totalSalary = employees.stream()
        .filter(e -> e.getDepartment().equals("HR") && e.getSalary() < 1000)
        .mapToDouble(Employee::getSalary)
        .sum();
        System.out.println("Total salary: " + totalSalary);

        List<Integer> integerList = Arrays.asList(5, 2, 9, 3, 7);
        int max = integerList.stream()
        .mapToInt(Integer::intValue)
        .max()
        .orElse(0);
        System.out.println("Maximum value: " + max);

        List<String> stringList2 = Arrays.asList("banana", "apple pie", "cherry", "apricot");
        String firstStringWithApple = stringList2.stream()
        .filter(s -> s.contains("apple"))
        .findFirst()
        .orElse("");
        System.out.println("First string with 'apple': " + firstStringWithApple);

        Map<String, Person> personMap = personList.stream()
        .collect(Collectors.toMap(Person::getName, p -> p));
        System.out.println("Person map: " + personMap);
}
}
