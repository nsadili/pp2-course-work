import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
    
    public static int compareByAge(Person a, Person b){
        return b.getAge()  - a.getAge();
    }

    public static void main(String[] args) {
        

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        // System.out.println(list);
        Stream<Integer> listStream = list.stream();
        Set<Integer> set =  listStream.filter(num -> num%2==0).collect(Collectors.toSet());
        System.out.print("A) ");
        System.out.println(set);

        List<Person> people = Arrays.asList(
            new Person("Nariman", 19, "Baku"),
            new Person("Shamil", 31, "Qabala"),
            new Person("Rauf", 48, "Neftchala"),
            new Person("Ismayil", 40, "Baku")
        );
        Stream<Person> peopleStream = people.stream();

        Set<Person> people30Baku = peopleStream.filter(c -> c.getAge()>30 && c.getCity().equals("Baku")).collect(Collectors.toSet());
        System.out.print("B) ");
        System.out.println(people30Baku);

        List<String> strs = Arrays.asList("abcd", "oudbdf", "sojdbnv","ajnsf");
        Stream<String> strStream = strs.stream();
        Set<Integer> length = strStream.map(a->a.length()).collect(Collectors.toSet());
        System.out.print("C) ");
        System.out.println(length);

        // Set<Person> sortedPeople = peopleStream1.sorted((a,b) -> a.getAge() - b.getAge()).collect(Collectors.toSet());
        // Set<Person> sortedPeople1 = peopleStream.sorted((a, b) -> a.getName().compareTo(b.getName())).collect(Collectors.toSet());
        
        // System.out.print("D) ");
        // System.out.println(sortedPeople1); // problem

        List<Double> doubles = Arrays.asList(1.0,2.6,3.8,4.0,5.3,6.6,7.9,8.1,9.0);
        Stream<Double> doubleStream = doubles.stream();
        double average = doubleStream
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.print("E) ");
        System.out.println(average);

        System.out.print("F) ");
        List<String> words = Arrays.asList("Abfvi", "Gfgasf", "Csdaf", "Agioew", "Skfnsfq", "Oeriweid");
        Stream<String> wordStream = words.stream();
        List<String> wordsWithA = wordStream
                .filter(word -> !word.startsWith("A"))
                .collect(Collectors.toList());
        System.out.print(wordsWithA+", ");
        List<String> uppercaseWords = wordsWithA.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println(uppercaseWords);

        System.out.print("G) ");
        List<Employee> employees = Arrays.asList(
            new Employee("Nariman", "IT", 1000),
            new Employee("Rufat", "IT", 100),
            new Employee("Shamil", "HR", 1300),
            new Employee("Mahammad", "catering", 1040)
        );
        Stream<Employee> emlpoyeeStream = employees.stream();
        double totalSalary = emlpoyeeStream.filter(employee -> !employee.getDepartment().equals("HR") && employee.getSalary() >= 1000).mapToDouble(Employee::getSalary).sum();
        System.out.println(totalSalary);

        System.out.print("H) ");
        List<Integer> integers = Arrays.asList(1,2,3,34,5,6,62,3,34,342,4,43,43);
        Stream<Integer> integerStream = integers.stream();
        Optional<Integer> max = integerStream.max(Integer::compareTo);
        System.out.println(max.get());

        System.out.print("I) ");
        List<String> str = Arrays.asList("Abfvi", "Gfgasf", "Csdaf", "Applesgsdgwef", "Skfnsfq", "Oeriweid");
        Stream<String> strStreamm = str.stream();
        Optional<String> result = strStreamm.filter(word -> word.startsWith("Apple")).findFirst();
        System.out.println(result.get());

        System.out.print("J) ");
        List<Person> peoplee = Arrays.asList(
            new Person("Nariman", 19, "Baku"),
            new Person("Shamil", 31, "Qabala"),
            new Person("Rauf", 48, "Neftchala"),
            new Person("Ismayil", 40, "Baku")
        );
        Map<String, Person> personMap = peoplee.stream().collect(Collectors.toMap(Person::getName, person -> person));
        System.out.println(personMap);

    }
}
class Person{
    private String name;
    private int age;
    private String city;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    @Override
    public String toString() {
        return getName()+" | "+getAge()+" | "+getCity();
    }
    // static int comparePersonAge implements Comparator<Person> {
    //     @Override
    //     public int compare(Person a, Person b) {
    //         return b.getAge() - a.getAge();
    //     }
    // }

}
class Employee{
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
        return getName()+" | "+getDepartment()+" | "+getSalary()+"AZN";
    }

    
}
