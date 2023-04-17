package Week11.pw5;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {
        Employee[] employees = { new Employee("Leyla", 18, 50000),
                                 new Employee("Elvin", 17, 60000),
                                 new Employee("Zehra", 17, 100000) };
        
        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println("Sorted by first name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("Sorted by age:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Sorted by salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

