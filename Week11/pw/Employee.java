import java.util.Arrays;
import java.util.Comparator;

class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary) {
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
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Asiman", "Mammadzada", 27, 30000),
                new Employee("Aysel", "Panahova", 18, 10000),
                new Employee("Nuray", "Aliyeva", 20, 9500),
                new Employee("Laman", "Quliyeva", 44, 7900)
        };

       
        Arrays.sort(employees, (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        System.out.println("Sorted by first name:");
        Arrays.stream(employees).forEach(System.out::println);

       
        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("Sorted by age:");
        Arrays.stream(employees).forEach(System.out::println);

        
        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println("Sorted by salary:");
        Arrays.stream(employees).forEach(System.out::println);
    }
}
