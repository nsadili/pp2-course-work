import java.util.Arrays;
import java.util.Comparator;

public class MainClassEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Asker", 25, 50000.0);
        employees[1] = new Employee("Orxan", 32, 75000.0);
        employees[2] = new Employee("Nigar", 42, 90000.0);
        employees[3] = new Employee("Leyla", 28, 55000.0);
        employees[4] = new Employee("İlham", 36, 80000.0);


        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName)); // sort by first name
        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge)); // sort by age
        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary)); // sort by salary
    }
}
