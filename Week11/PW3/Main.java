import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ali", 30, 5000),
                new Employee("Nihad", 25, 6000),
                new Employee("Toghrul", 35, 5500),
                new Employee("Ayxan", 28, 4500)
        };

        // Sort by firstName using a lambda expression
        Arrays.sort(employees, (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        System.out.println("Sorted by firstName: " + Arrays.toString(employees));

        // Sort by age using a lambda expression
        Arrays.sort(employees, (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        System.out.println("Sorted by age: " + Arrays.toString(employees));

        // Sort by salary using a method reference
        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Sorted by salary: " + Arrays.toString(employees));
    }
}
