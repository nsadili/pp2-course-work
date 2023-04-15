package pw5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Jala", "Aytac", "Nigar");
        strings.sort(String::compareToIgnoreCase);
        System.out.println(strings);

        Employee[] employees = {
                new Employee("Jala", 30, 50000),
                new Employee("Aytac", 25, 60000),
                new Employee("Nigar", 35, 40000)
        };

        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
