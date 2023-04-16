package pw5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = { new Employee("Rahima", 17, 3500.0),
                new Employee("Vasila", 18, 4500.0),
                new Employee("Laman", 18, 4000.0),
                new Employee("Arzu", 19, 5000.0) };
        Stream<Employee> empStream = Arrays.stream(employees);
        // empStream.sorted((a, b) -> Integer.compare(a.getAge(), b.getAge()))
        //         .forEach(System.out::println);
                empStream.sorted((a,b)->Double.compare(a.getSalary(), b.getSalary())).forEach(System.out::println);

        // System.out.println(empStream.sorted());
        // Arrays.sort(employees, (a, b) ->
        // a.getFirstname().compareTo(b.getFirstname()));
        // Arrays.sort(employees, (a, b) -> a.getAge().compareTo(b.getAge()));
        // Arrays.sort(employees, (a, b) -> a.getSalary().compareTo(b.getSalary()));
        // printEmployees(employees);
    }

    public static void printEmployees(Employee employee[]) {
        for (Employee a : employee) {
            System.out.println(a);
        }

    }

}
