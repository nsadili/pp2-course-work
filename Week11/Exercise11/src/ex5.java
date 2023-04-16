import java.util.Arrays;
import java.util.Comparator;

class Employee {
    private String firstname;
    private int age;
    private double salary;

    public Employee(String firstname, int age, double salary) {
        this.firstname = firstname;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    //@Override
    public String toString() {
        return "Employee{" + "firstName='" + firstname + ", age=" + age +
                ", salary=" + salary + '}';
    }
}

public class ex5 {
    interface EmployeeSorter {
        void sort(Employee[] empArray);
    }

    public static void main(String[] args) {
        EmployeeSorter byName = (Employee[] empArr) -> {
            Arrays.sort(empArr, Comparator.comparing(Employee::getFirstname));
        };

        EmployeeSorter byAge = (Employee[] empArr) -> {
            Arrays.sort(empArr, Comparator.comparing(Employee::getAge));
        };

        EmployeeSorter bySalary = (Employee[] empArr) -> {
            Arrays.sort(empArr, Comparator.comparing(Employee::getSalary));
        };


        Employee[] employees = {
                new Employee("Ali", 25, 2000),
                new Employee("Josh", 20, 5000),
                new Employee("John", 33, 1500)
        };

        byName.sort(employees);
        System.out.println(Arrays.toString(employees));

        byAge.sort(employees);
        System.out.println(Arrays.toString(employees));

        bySalary.sort(employees);
        System.out.println(Arrays.toString(employees));
    }
}
