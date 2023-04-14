package PW5;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Leyla", 18, 2000),
                                new Employee("Elvin", 17, 2000),
                                new Employee("Aysel", 30, 2500)};

        
        // print(employees);
        // System.out.println();
        // Arrays.sort(employees, (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        // Arrays.sort(employees, (e1, e2) -> e1.getAge().compareTo(e2.getAge()));
        // Arrays.sort(employees, (e1, e2) -> e1.getSalary().compareTo(e2.getSalary()));
        // print(employees);

        print(employees);
        System.out.println();
        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        // Arrays.sort(employees, Comparator.comparing(Employee::getAge));
        // Arrays.sort(employees, Comparator.comparing(Employee::getSalary));
        print(employees);
    }

    public static void print(Employee[] employees){
        for (Employee e: employees) System.out.println(e);
    }
}
