import java.util.*;
import java.util.stream.*;

public class StreamTasks {
    
    public static void main(String[] args) {
        
        // Task a
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println(evenNumbers);
        
        // Task b
        List<Person> people = Arrays.asList(new Person("John", 32, "Baku"),
                                            new Person("Alice", 25, "London"),
                                            new Person("Bob", 38, "Baku"),
                                            new Person("Carol", 29, "New York"));
        List<Person> filteredPeople = people.stream()
                                             .filter(p -> p.getAge() > 30 && p.getCity().equals("Baku"))
                                             .collect(Collectors.toList());
        System.out.println(filteredPeople);
        
        // Task c
        List<String> strings = Arrays.asList("apple", "banana", "orange", "pear");
        int sumOfLengths = strings.stream()
                                  .mapToInt(String::length)
                                  .sum();
        System.out.println(sumOfLengths);
        
        // Task d
        List<Person> peopleToSort = Arrays.asList(new Person("Alice", 25, "London"),
                                                   new Person("Carol", 29, "New York"),
                                                   new Person("Bob", 38, "Baku"),
                                                   new Person("John", 32, "Baku"));
        List<Person> sortedPeople = peopleToSort.stream()
                                                 .sorted(Comparator.comparingInt(Person::getAge)
                                                                    .thenComparing(Person::getName))
                                                 .collect(Collectors.toList());
        System.out.println(sortedPeople);
        
        // Task e
        List<Double> doubles = Arrays.asList(1.2, 2.3, 3.4, 4.5, 5.6);
        double average = doubles.stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(Double.NaN);
        System.out.println(average);
        
        // Task f
        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "cherry");
        List<String> filteredFruits = fruits.stream()
                                            .filter(s -> !s.startsWith("A"))
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println(filteredFruits);
        
        // Task g
        List<Employee> employees = Arrays.asList(new Employee("Alice", "HR", 500),
                                                  new Employee("Bob", "IT", 2000),
                                                  new Employee("Carol", "HR", 800),
                                                  new Employee("John", "IT", 1200));
        double totalSalary = employees.stream()
                                      .filter(e -> e.getDepartment().equals("HR") && e.getSalary() < 1000)
                                      .mapToDouble(Employee::getSalary)
                                      .sum();
        System.out.println(totalSalary);
        
        // Task h
        List<Integer> integers = Arrays.asList(4, 3, 6, 1, 5, 2);
        int maxInteger = integers.stream()
                                 .max(Integer::compare)
                                 .orElse(Integer.MIN_VALUE);
        System.out.println(maxInteger);
        
        // Task i
        List<String> words = Arrays.asList("apple", "banana", "pear", "grape");
        String firstWordContainingApple = words.stream()
                                               .filter(s -> s.contains("apple"))
                                               .findFirst()
                                               .orElse(null);
        System.out.println(firstWordContainingApple);
        // Task j
        List<Integer> numbersToSquare = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbersToSquare.stream()
                                                      .map(n -> n * n)
                                                      .collect(Collectors.toList());
        System.out.println(squaredNumbers);
    }
}

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
    
    public String toString() {
        return name + " (" + age + ", " + city + ")";
    }
}

class Employee {
    private String name;
    private String department;
    private int salary;
    public Employee(String name, String department, int salary) {
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
    
    public int getSalary() {
        return salary;
    }
    
    public String toString() {
        return name + " (" + department + ", " + salary + ")";
    }
}    
