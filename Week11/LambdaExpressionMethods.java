package Week11;
import java.util.Arrays;
import java.util.Comparator;
public class LambdaExpressionMethods {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("Alisaidq", 20, 1500),
                new Employee("Fikrat", 22, 1000),
                new Employee("Ali", 18, 500),
                new Employee("Farid", 24, 1200),
                new Employee("Sadiq", 19, 900)
        };


        Arrays.sort(employees, Comparator.comparing(Employee::getFirstname));
        System.out.println("Employees' firstname: " + Arrays.toString(employees));


        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("Employees' age: " + Arrays.toString(employees));


        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Employees' salary: " + Arrays.toString(employees));
    }
}
