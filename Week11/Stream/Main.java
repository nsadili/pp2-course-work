package Stream;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.DoubleSupplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 8, 65, 4, 3, 22, 11);

        var filteredList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("------------");
        filteredList.forEach(System.out::println);
        System.out.println("-------------");
        List<Person> person = Arrays.asList(new Person(31, "Shamil", "Baku"),
                new Person(21, "Ali", "Baku"),
                new Person(32, "Rufet", "La"),
                new Person(33, "Nariman", "Baku"));

        person.stream().filter(p -> p.getAge() > 30 && p.getCity().equalsIgnoreCase("baku"))
                .forEach(f -> System.out.println(f));

        List<String> words = Arrays.asList("foo", "car", "policecar", "abrakadabra");
        int res = words.stream().map(s -> s.length()).reduce(0, (a, b) -> a + b);
        System.out.println("Sum of lenght of strings:" + res);

        person.stream().sorted((a, b) -> a.getAge() - b.getAge()).forEach(System.out::print); // sort by age in
                                                                                              // ascending order
        System.out.println();
        person.stream().sorted((a, b) -> b.getAge() - a.getAge()).forEach(System.out::print); // sort by age in
                                                                                              // descending order
        System.out.println();
        System.out.println("------------Sort by name--------------------");
        person.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).forEach(System.out::println); // sort by
                                                                                                           // name in
                                                                                                           // alphepatic
                                                                                                           // order
        System.out.println("-----------------------------------");

        List<Double> doubleList = Arrays.asList(1.0, 2.0, 4.0, 1.0);
        // var average = doubleList.stream().reduce(0.0, (a,b) ->
        // a+b)/doubleList.size();
        var average = doubleList.stream().mapToDouble(Double::valueOf).average();
        DoubleSupplier s = () -> 0.0;
        System.out.println("Average of Double:" + average.orElseGet(s));

        List<String> wordsStartwithA = Arrays.asList("Alibaba", "shamil", "joejong", "Abrakadabra", "april", "August");

        var wordstoUpper = wordsStartwithA.stream().filter(ss -> ss.startsWith("A")).map(ss -> ss.toUpperCase())
                .toList(); // filter + convert to uppercase
        System.out.println("words start with A: " + wordstoUpper);

        List<Employee> employee = new ArrayList<>(Arrays.asList(
                new Employee("Shamil", "IT", 5000.0),
                new Employee("Ali", "HR", 350.25),
                new Employee("Farid", "PR", 2500),
                new Employee("Rufet", "HR", 4500),
                new Employee("NAriman", "CS", 3600),
                new Employee("Gulshen", "HR", 1200), 
                new Employee("Polad", "HR", 250.3)));

        var employeDEpartment = employee.stream().filter(e -> e.getDepartment().equals("HR") && e.getSalary() < 1000)
                .collect(Collectors.toList());
        System.out.println("Printing  Hr department salary < 1000");
        employeDEpartment.forEach(System.out::print);

        employee.removeIf( e -> e.getDepartment().equals("HR") && e.getSalary() <
        1000);
        System.out.println(employee);

        employee.removeAll(employeDEpartment);

        List<Integer> findMax = Arrays.asList(1, 2, 3, 4, 5, 65, 34, 56, 98);

        var max = findMax.stream().reduce(Integer::max);
        System.out.println();
        System.out.println("Maximum integer in list:" + max.orElse(0));

        List<String> findApple = Arrays.asList("Polar", "color", "apple", "look", "asd", "apple", "prere", "fds");

        Optional<String> firstApple = findApple.stream().filter(w -> w.equals("apple")).findFirst();
        System.out.println(firstApple.orElse("no such element"));

        // System.out.println();


    }

}
