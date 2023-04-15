import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseStreamAPI {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filteredIntegers = integers.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println("\nFiltered Integers: " + filteredIntegers);

        List<Person> persons = List.of(new Person("Azer", 27, "Baku"), new Person("Babak", 35, "Sheki"),
                new Person("Samir", 38, "Baku"));
        List<Person> filteredPersons = persons.stream().filter(p -> p.getAge() > 30 && p.getCity().equals("Baku"))
                .collect(Collectors.toList());
        System.out.println("\nFiltered Persons: " + filteredPersons);

        List<String> strings = List.of("programming", "analogy", "astrophysics", "university");
        int sumOfLengths = strings.stream().mapToInt(String::length).sum();
        System.out.println("\nSum of Lengths: " + sumOfLengths);

        List<Person> personsToSort = new ArrayList<>(persons);
        personsToSort.add(new Person("Nurlan", 29, "Baku"));
        personsToSort.add(new Person("Vasif", 31, "Baku"));
        List<Person> sortedPersons = personsToSort.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
                .collect(Collectors.toList());
        System.out.println("\nSorted Persons: " + sortedPersons);

        List<Double> doubles = List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        double average = doubles.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
        System.out.println("\nAverage: " + average);

        List<String> stringsToFilter = List.of("programming", "analogy", "astrophysics", "university", "school");
        List<String> filteredAndUppercasedStrings = stringsToFilter.stream().filter(s -> !s.startsWith("A"))
                .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("\nFiltered and Uppercased Strings: " + filteredAndUppercasedStrings);

        List<Employee> employees = List.of(new Employee("Azer", "HR", 800), new Employee("Babak", "Sales", 1200),
                new Employee("Samir", "HR", 900), new Employee("Nurlan", "Marketing", 1500));
        double totalSalary = employees.stream().filter(e -> e.getDepartment().equals("HR") && e.getSalary() < 1000)
                .mapToDouble(Employee::getSalary).sum();
        System.out.println("\nTotal Salary: " + totalSalary);

        List<Integer> integerList = List.of(10, 20, 30, 40, 50);
        int maxValue = integerList.stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println("\nMax Value: " + maxValue);

        List<String> stringList = List.of("analogy", "astrophysics", "programming", "university");
        String firstStringWithProgramming = stringList.stream().filter(s -> s.contains("programming")).findFirst()
                .orElse(null);
        System.out.println("\nFirst String with Programming: " + firstStringWithProgramming);

        Map<String, Person> personMap = persons.stream().collect(Collectors.toMap(Person::getName, person -> person));
        System.out.println("\nPerson Map: " + personMap);
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