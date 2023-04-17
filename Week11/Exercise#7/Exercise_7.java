import java.util.*;
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
}

public class Exercise_7 {
    public static void main(String[] args) {
        
        // a
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println(evenNumbers);
        
        // b
        List<Person> persons = Arrays.asList(
            new Person("Alice", 25, "Baku"),
            new Person("Bob", 40, "New York"),
            new Person("Charlie", 35, "Baku"),
            new Person("David", 30, "Paris")
        );
        List<Person> filteredPersons = persons.stream()
                                                .filter(p -> p.getAge() > 30 && p.getCity().equals("Baku"))
                                                .collect(Collectors.toList());
        System.out.println(filteredPersons);
        
        // c
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        int sumLengths = strings.stream()
                                    .mapToInt(String::length)
                                    .sum();
        System.out.println(sumLengths);
        
        // d
        List<Person> personList = Arrays.asList(
            new Person("Alice", 25, "Baku"),
            new Person("David", 30, "Paris"),
            new Person("Charlie", 35, "Baku"),
            new Person("Bob", 40, "New York")
        );
        List<Person> sortedPersons = personList.stream()
                                                    .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
                                                    .collect(Collectors.toList());
        System.out.println(sortedPersons);
        
        // e
        List<Double> doubles = Arrays.asList(1.5, 2.0, 3.5, 4.0, 5.5);
        double average = doubles.stream()
                                    .mapToDouble(Double::doubleValue)
                                    .average()
                                    .orElse(Double.NaN);
        System.out.println(average);
        
        // f
        List<String> fruitList = Arrays.asList("apple", "banana", "apricot", "cherry", "date");
        List<String> filteredFruitList = fruitList.stream()
                                                    .filter(s -> !s.startsWith("A"))
                                                    .map(String::toUpperCase)
                                                    .collect(Collectors.toList());
        System.out.println(filteredFruitList);
        
        // g
        List<Employee> employeeList = Arrays.asList(
            new Employee("Alice", "HR", 500),
            new Employee("Bob", "Marketing", 1500        ),
            new Employee("Charlie", "HR", 800),
            new Employee("David", "IT", 1200),
            new Employee("Eva", "HR", 900)
        );
        double totalSalary = employeeList.stream()
                                            .filter(e -> e.getDepartment().equals("HR") && e.getSalary() < 1000)
                                            .mapToDouble(Employee::getSalary)
                                            .sum();
        System.out.println(totalSalary);
        
        // h
        List<Integer> integerList = Arrays.asList(10, 20, 30, 40, 50);
        int max = integerList.stream()
                                .max(Integer::compareTo)
                                .orElseThrow(NoSuchElementException::new);
        System.out.println(max);
        
        // i
        List<String> stringList = Arrays.asList("banana", "apple pie", "cherry", "date");
        String firstStringWithApple = stringList.stream()
                                                    .filter(s -> s.contains("apple"))
                                                    .findFirst()
                                                    .orElse(null);
        System.out.println(firstStringWithApple);
        
        // j
        List<Person> personList2 = Arrays.asList(
            new Person("Alice", 25, "Baku"),
            new Person("Bob", 40, "New York"),
            new Person("Charlie", 35, "Baku"),
            new Person("David", 30, "Paris")
        );
        Map<String, Person> personMap = personList2.stream()
                                                        .collect(Collectors.toMap(Person::getName, person -> person));
        System.out.println(personMap);
    }
}    
