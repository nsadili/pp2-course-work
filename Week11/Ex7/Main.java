package Week11.Ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // TASK a
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 17, 23, 12, 8, 78, 3, 9, 36));
        Stream<Integer> numsStream = nums.stream();
        // numsStream.filter(n->n%2==0).forEach(System.out::println);

        // TASK b
        Person p1 = new Person("Rufat", 18, "Baku");
        Person p2 = new Person("Shamil", 40, "Gabala");
        Person p3 = new Person("Arzum", 32, "Baku");
        Person p4 = new Person("Nariman", 25, "Neftcala");
        List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));
        Stream<Person> personStream = persons.stream();
        // personStream.filter(p->p.getAge()>30).filter(p->(p.getCity()=="Baku")).forEach(System.out::println);

        // TASK c
        String[] names = { "Shamil", "Vusal", "Leyla", "Elvin", "Vugar" };
        Stream<String> namesStream = Arrays.stream(names);
        int totalLength = namesStream.map(str -> str.length()).reduce(0, (a, b) -> a + b);
        // System.out.println(totalLength);


        // TASK d
        Stream<Person> personsSortedByAge = persons.stream().sorted((a, b) -> Integer.compare(a.getAge(), b.getAge()));
        // personsSortedByAge.forEach(System.out::println);
        // System.out.println();


        Stream<Person> personsSortedByName = persons.stream()
                .sorted((a, b) -> a.getFirstname().compareTo(b.getFirstname()));
        // personsSortedByName.forEach(System.out::println);


        // TASK e
        Double[] doubles = { 2.4, 3.2, 10.9, 7.5, 12.5, 6.1 };
        Stream<Double> doublesStream = Arrays.stream(doubles);
        double avg = doublesStream.mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
        // System.out.println("The average: "+avg);


        // TASK f
        String[] names2 = { "Shamil", "Arzum", "Rufat", "Abdulla", "Nariman" };
        Stream<String> names2Stream = Arrays.stream(names2);
        // names2Stream
        //         .filter(name -> name.startsWith("A"))
        //         .map(name -> name.toUpperCase())
        //         .forEach(System.out::println);


        // TASK g
        List<Employee> employees = Arrays.asList(
                new Employee("Rufat", "IT", 1500),
                new Employee("Shamil", "HR", 900),
                new Employee("Arzum", "Finance", 1200),
                new Employee("Nariman", "HR", 800));

        Stream<Employee> empStream = employees.stream();
        double totalSalary = empStream.filter(emp->emp.getDepartment()!="HR").filter(emp->emp.getSalary()>=1000)
        .map(Employee :: getSalary).reduce(0.0, Double::sum);
        // System.out.println("Total salary: "+totalSalary);
        

        // TASK h
        Set<Integer> nums2 = new HashSet<>(Arrays.asList( 6, 7, 3, 9, 1, 2, 8, 4, 5));
        Stream<Integer> nums2Stream = nums2.stream();
        Optional<Integer> max = nums2Stream.max((a,b)->Integer.compare(a, b));
        // if (max.isPresent()) System.out.println("Max integer: "+max.get());


        // TASK i
        List<String> fruits = Arrays.asList("banana", "orange", "apple pie", "kiwi", "apple juice");
        Stream<String> fruitsStream = fruits.stream();
        fruitsStream.filter(str->str.contains("apple")).forEach(System.out::println);;

        // TASK j
        Map<String, Person> personMap =  persons.stream()
            .collect(Collectors.toMap(Person::getFirstname, Function.identity()));
        System.out.println(personMap);
        


        

    }

}
