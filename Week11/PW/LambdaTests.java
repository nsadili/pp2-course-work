package PW;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaTests {
    public static void main(String[] args){
        Employee[] arr = {new Employee("a", 34, 1200),new Employee("c", 30, 1000),new Employee("b", 40, 1100),new Employee("aa", 20, 100)};

        Comparator<Employee> compareAge = (a, b) -> a.getAge().compareTo(b.getAge());
        Comparator<Employee> compareName = (a, b) -> a.getName().compareTo(b.getName());
        Comparator<Employee> compareSalary = (a, b) -> a.getSalary().compareTo(b.getSalary());

        Arrays.sort(arr, compareAge);
        for(Employee a: arr){
            System.out.print("Name: "+a.getName() + " Age: " + a.getAge() + " Salary: " + a.getSalary());
        }
        System.out.println();

        Arrays.sort(arr, compareName);
        for(Employee a: arr){
            System.out.print("Name: "+a.getName() + " Age: " + a.getAge() + " Salary: " + a.getSalary());
        }
        System.out.println();

        Arrays.sort(arr, compareSalary);
        for(Employee a: arr){
            System.out.print("Name: "+a.getName() + " Age: " + a.getAge() + " Salary: " + a.getSalary());
        }
        System.out.println();

    }
}

class Employee{
    private String name;
    private Integer age, salary;
    Employee(String name, Integer age, Integer salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}