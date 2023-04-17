package Week11;

import java.util.Arrays;

import java.util.stream.Stream;
public class Employee {
    private String firstname;
    private Integer age;
    private Double salary;
    public Employee(String firstname, Integer age, Double salary) {
        this.firstname = firstname;
        this.age = age;
        this.salary = salary;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [firstname=" + firstname + ", age=" + age + ", salary=" + salary + "]";
    }
    
    public static void main(String[] args) {
        Employee[] employees = { new Employee("Murad", 17, 5500.0),
                new Employee("Ilkin", 18, 6500.0),
                new Employee("Orxan", 19, 7000.0),
                new Employee("Ehtiram", 20, 3000.0) };
        Stream<Employee> empStream = Arrays.stream(employees);
        
                empStream.sorted((a,b)->Double.compare(a.getSalary(), b.getSalary())).forEach(System.out::println);

     
    }

    public static void printEmployees(Employee employee[]) {
        for (Employee a : employee) {
            System.out.println(a);
        }

    }

}