package pp2.week11;
import java.util.*;
public class Employees {
    private String firstName;
    private int age;
    private double salary;

    public Employees(String firstName, int age, double salary) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee ("+ "firstName='" + firstName + '\'' + ", lastName='" + ", age=" + age + ", salary=" + salary + ')';
    }
    public class EmployeeSort {
        public static void main(String[] args) {
            Employees[] employees = {
                    new Employees("Khavar", 40, 1000000.0),
                    new Employees("Ayla", 40, 2000000.0),
                    new Employees("Emil", 40, 3000000.0)
            };

            Arrays.sort(employees, (emp1, emp2) -> emp1.getFirstName().compareTo(emp2.getFirstName()));

            System.out.println("Sorted by first name:");
            for (Employees emp : employees) {
                System.out.println(emp);
            }
            System.out.println();
            Arrays.sort(employees, Comparator.comparingInt(Employees::getAge));

            System.out.println("Sorted by age:");
            for (Employees emp : employees) {
                System.out.println(emp);
            }
            System.out.println();

            Arrays.sort(employees, (emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()));
            System.out.println("Sorted by salary:");
            for (Employees employee : employees) {
                System.out.println(employee);
            }
        }
    }

}
