import java.util.Arrays;
import java.util.Comparator;

class Employee {
    private String firstName;
    private int age;
    private int salary;

    public Employee(String firstName, int age, int salary) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Azer", 22, 3500),
                new Employee("Babak", 25, 3800),
                new Employee("Samir", 28, 4800),
                new Employee("Nurlan", 32, 5900),
                new Employee("Vasif", 35, 6500)
        };

        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println("Sort by First Name:");
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("Sort by Age:");
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, Comparator.comparingInt(Employee::getSalary));
        System.out.println("Sort by Salary:");
        System.out.println(Arrays.toString(employees));
    }
}
