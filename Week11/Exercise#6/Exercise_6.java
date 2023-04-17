import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercise_6 {

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ramil", "Khaspoladov", 25, 50000));
        employees.add(new Employee("Nuradin", "Sadili", 30, 60000));
        employees.add(new Employee("Emil", "Ibadov", 35, 70000));
        employees.add(new Employee("Murad", "Kadirov", 40, 80000));
        employees.add(new Employee("Farid", "Ibadov", 45, 90000));

        // Use stream to filter employees who are older than 30 and sort them by salary in descending order
        List<Employee> filteredAndSortedEmployees = employees.stream()
                .filter(e -> e.getAge() > 30)
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .collect(Collectors.toList());

        System.out.println("Filtered and sorted employees:");
        filteredAndSortedEmployees.forEach(System.out::println);

        // Use allMatch to check if all employees are older than 20
        boolean allOlderThan20 = employees.stream()
                .allMatch(e -> e.getAge() > 20);

        System.out.println("Are all employees older than 20? " + allOlderThan20);

        // Use count to count the number of employees with a salary greater than 60000
        long countSalaryGreater60k = employees.stream()
                .filter(e -> e.getSalary() > 60000)
                .count();

        System.out.println("Number of employees with salary greater than 60000: " + countSalaryGreater60k);

        // Use generate and limit to generate a stream of 5 random integers
        System.out.print("Random integers: ");
        new Random().ints().limit(5).forEach(i -> System.out.print(i + " "));

        // Use forEach to print the full names of all employees
        System.out.println("\nFull names of all employees:");
        employees.stream().forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));

        // Use findFirst to find the first employee whose age is greater than 30
        Optional<Employee> firstEmployeeOlderThan30 = employees.stream()
                .filter(e -> e.getAge() > 30)
                .findFirst();

        firstEmployeeOlderThan30.ifPresentOrElse(
                e -> System.out.println("First employee older than 30: " + e),
                () -> System.out.println("No employee older than 30 found"));

        // Use map to get a list of the first names of all employees
        List<String> firstNames = employees.stream()
                .map(Employee::getFirstName)
                .collect(Collectors.toList());

        System.out.println("First names of all employees: " + firstNames);
    }

    private static class Employee {
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
    }
}

       
