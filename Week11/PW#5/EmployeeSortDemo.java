package MyFirstproject.src;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSortDemo {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Ravan", "Abdinli", 18, 50000),
                new Employee("Shahmar", "Aghayev", 17, 75000),
                new Employee("Nihat", "Mammadli", 40, 40000),
                new Employee("Farhad", "Alibayli", 17, 60000)
        };

        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println("Employees sorted by first name: " + Arrays.toString(employees));

        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("Employees sorted by age: " + Arrays.toString(employees));

        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Employees sorted by salary: " + Arrays.toString(employees));
    }

    static class Employee {
        private final String firstName;
        private final String lastName;
        private final int age;
        private final double salary;

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
            return firstName + " " + lastName + ", age " + age + ", salary $" + salary;
        }
    }
}

