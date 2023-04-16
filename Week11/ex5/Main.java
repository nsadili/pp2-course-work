package Week11.ex5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<>();
        Collections.addAll(
            arr,
            new Employee("Zaur", 18, 10000000),
            new Employee("Jack", 22, 9474),
            new Employee("Vasya", 94, 674.1),
            new Employee("Valera", 37, 0.22)
        );
        // By first name
        arr.sort((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        System.out.println(arr);

        // By age
        arr.sort((e1, e2) -> e1.getAge() - e2.getAge());
        System.out.println(arr);

        // By salary in descending order
        arr.sort((e1, e2) -> e2.getSalary() > e1.getSalary() ? 1 : -1);
        System.out.println(arr);
    }
}
