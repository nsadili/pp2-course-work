package week11;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExpressions implements Comparable<LambdaExpressions> {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public LambdaExpressions(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(LambdaExpressions other) {
        return this.firstName.compareTo(other.firstName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        LambdaExpressions[] employees = new LambdaExpressions[5];
        employees[0] = new LambdaExpressions("ismayil", "ismayilov", 30, 50000);
        employees[1] = new LambdaExpressions("emin", "sadigov", 25, 60000);
        employees[2] = new LambdaExpressions("evez", "bagirov", 35, 55000);
        employees[3] = new LambdaExpressions("ismael", "muaataz", 40, 45000);
        employees[4] = new LambdaExpressions("akif", "akifov", 22, 70000);

        System.out.println("array of employees:");
        Arrays.stream(employees).forEach(System.out::println);
        Arrays.sort(employees, (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        System.out.println("\n sort by first name:");
        Arrays.stream(employees).forEach(System.out::println);
        Arrays.sort(employees, (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        System.out.println("\n sort by age:");
        Arrays.stream(employees).forEach(System.out::println);
        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println("\n sort by salary:");
        Arrays.stream(employees).forEach(System.out::println);
    }
}
