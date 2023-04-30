package Week11;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaExpressionMethods {

    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("Eljan", 20, 5000),
                new Employee("Elnur", 30, 6000),
                new Employee("Ramin", 40, 7000),
                new Employee("Davud", 35, 8000),
                new Employee("Tofiq", 20, 4000)
        };


        Arrays.sort(employees, Comparator.comparing(Employee::getFirstname));
        System.out.println("Employees sorted by firstname: " + Arrays.toString(employees));


        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("Employees sorted by age: " + Arrays.toString(employees));


        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Employees sorted by salary: " + Arrays.toString(employees));
    }
}
