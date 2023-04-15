package Ex6;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println(evenNumbers); 
        
        List<Person> persons = Arrays.asList(
            new Person("John", 25, "New York"),
            new Person("Ilqar", 35, "Baku"),
            new Person("Jeyhun", 40, "Baku"),
            new Person("Alice", 30, "London")
        );
        List<Person> filteredPersons = persons.stream()
                                                .filter(p -> p.getAge() > 30 && p.getCity().equals("Baku"))
                                                .collect(Collectors.toList());
        System.out.println(filteredPersons); 
        
        List<String> strings = Arrays.asList("foo", "bar", "baz");
        int sumOfLengths = strings.stream()
                                    .mapToInt(String::length)
                                    .sum();
        System.out.println(sumOfLengths); 
        
       
        List<Person> sortedPersons = persons.stream()
                                                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
                                                .collect(Collectors.toList());
        System.out.println(sortedPersons); 
        
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        OptionalDouble average = doubles.stream()
                                            .mapToDouble(Double::doubleValue)
                                            .average();
        System.out.println(average.getAsDouble()); 
        
        List<String> filteredAndUppercaseStrings = strings.stream()
                                                            .filter(s -> !s.startsWith("A"))
                                                            .map(String::toUpperCase)
                                                            .collect(Collectors.toList());
        System.out.println(filteredAndUppercaseStrings); 
        
        List<Employee> employees = Arrays.asList(
            new Employee("Brett", "IT", 2000),
            new Employee("Kamal", "HR", 800),
            new Employee("Antony", "Sales", 1500),
            new Employee("Albert", "HR", 1200)
        );

    double totalSalary = employees.stream()
                                    .filter(e -> e.getDepartment().equals("HR") && e.getSalary() < 1000)
                                    .mapToDouble(Employee::getSalary)
                                    .sum();
    System.out.println(totalSalary); 

    List<Integer> integers = Arrays.asList(5, 2, 8, 1, 9, 3, 6);
    int maxInt = integers.stream()
                            .max(Integer::compare)
                            .get();
    System.out.println(maxInt); 
    
    List<String> fruits = Arrays.asList("banana", "orange", "apple", "pear");
    Optional<String> firstFruitWithApple = fruits.stream()
                                                    .filter(s -> s.contains("apple"))
                                                    .findFirst();
    System.out.println(firstFruitWithApple.get()); 
    
    Map<String, Person> personsMap = persons.stream()
                                                .collect(Collectors.toMap(Person::getName, p -> p));
    System.out.println(personsMap);
}

}
