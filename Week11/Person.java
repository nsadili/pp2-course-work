package Week11;

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

class Main {
    public static void main(String[] args) {
        // a. Filter out even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // b. Filter persons based on age and city
        List<Person> persons = Arrays.asList(
                new Person("John", 25, "Baku"),
                new Person("Jane", 35, "New York"),
                new Person("Mike", 40, "Baku")
        );
        List<Person> filteredPersons = persons.stream()
                .filter(p -> p.getAge() > 30 && p.getCity().equals("Baku"))
                .collect(Collectors.toList());
        System.out.println("Filtered persons: " + filteredPersons);

        // c. Map strings to their length and find the sum of lengths
        List<String> strings = Arrays.asList("Hello", "World", "Stream", "API");
        int sumOfLengths = strings.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("Sum of lengths: " + sumOfLengths);

        // d. Sort persons by age and name
        List<Person> personList = Arrays.asList(
                new Person("John", 30, "London"),
                new Person("Jane", 25, "Paris"),
                new Person("Mike", 35, "New York")
        );
        List<Person> sortedPersons = personList.stream()
                .sorted(Comparator.comparingInt(Person::getAge)
                        .thenComparing(Person::getName))
                .collect(Collectors.toList());
        System.out.println("Sorted persons: " + sortedPersons);

        // e. Find the average of a list of doubles
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
        double average = doubles.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
        System.out.println("Average: " + average);

        // f. Filter strings starting with "A" and convert to uppercase
        List<String> stringList = Arrays.asList("Apple", "Banana", "Avocado", "Apricot");
        List<String> filteredStrings = stringList.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Filtered strings: " + filteredStrings);

        // g. Filter employees by department and salary, calculate total salary
        List<Employee> employees = Arrays.asList(
                new Employee("John", "HR", 800),
                new Employee("Jane", "IT", 1200),
                new Employee("Mike", "HR", 1500)
        );
        double totalSalary = employees.stream()
                .filter(e -> e.getDepartment().equals("HR") && e.getSalary() < 1000)
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Total salary: " + totalSalary);

        // h. Find the maximum value in a list of integers
        List<Integer> integerList = Arrays.asList(10, 5, 20, 15, 25);
        int maxValue = integerList.stream()
                .max(Integer::compare)
                .orElse(0);
        System.out.println("Maximum value: " + maxValue);

        // i. Find the first string that contains "apple"
        List<String> fruitList = Arrays.asList("banana", "apple", "orange", "grape");
        String firstStringWithApple = fruitList.stream()
                .filter(s -> s.contains("apple"))
                .findFirst()
                .orElse("");
        System.out.println("First string with apple: " + firstStringWithApple);

        // j. Collect persons into a map with name as key and person object as value
        List<Person> personObjects = Arrays.asList(
                new Person("John", 30, "London"),
                new Person("Jane", 25, "Paris"),
                new Person("Mike", 35, "New York")
        );
        Map<String, Person> personMap = personObjects.stream()
                .collect(Collectors.toMap(Person::getName, p -> p));
        System.out.println("Person map: " + personMap);
    }
}
