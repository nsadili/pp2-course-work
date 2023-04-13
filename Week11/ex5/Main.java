package ex5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee[] arr = new Employee[] { new Employee("Shamil", 19, 5000),
                new Employee("Rufet", 18, 2500),
                new Employee("Nariman", 16, 956),
                new Employee("Ferid", 22, 2222)

        };

        Arrays.sort(arr, (a, b) -> a.getName().compareTo(b.getName())); // sort by name
        System.out.println("Sort by name");
        System.out.println(Arrays.asList(arr));

        System.out.println("Sort by Salary");
        Arrays.sort(arr, Main::compareBySalary);

        for (var e : arr) {
            System.out.print(e + " ");
        }

        compareEmployee c = new compareEmployee();
        Arrays.sort(arr, c::compare);
        System.out.println("Sort by descending Age");
        for (var e : arr) {
            System.out.print(e + " ");
        }

    }

    public static int compareBySalary(Employee a, Employee b) {
        return a.getSalary() - b.getSalary();
    }

}

class compareEmployee implements Comparator<Employee> {

    @Override
    public int compare(Employee a, Employee b) {
        return b.getAge() - a.getAge();
    }

}
