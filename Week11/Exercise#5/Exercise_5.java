import java.util.Arrays;
import java.util.Comparator;

public class Exercise_5 {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ramil", "Khaspoladov", 25, 3000),
                new Employee("Nuradin", "Sadili", 30, 10500),
                new Employee("Emil", "Ibadov", 40, 8000),
                new Employee("Murad", "Kadirov", 35, 7000)
        };

        // sort by first name
        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println("Sorted by first name:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // sort by age
        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("\nSorted by age:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // sort by salary
        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("\nSorted by salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    static class Employee {
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
            return firstName + " " + lastName + " (age: " + age + ", salary: " + salary + ")";
        }
    }
}

