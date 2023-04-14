package Week11;
import java.util.Arrays;
import java.util.Comparator;

class Employee {
    private String firstName;
    private int age;
    private double salary;
    
    public Employee(String firstName, int age, double salary) {
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
    
    public double getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return firstName + " (age " + age + ", salary $" + salary + ")";
    }
}


public class EmployeeSort {
    public static void main(String args[]){
        Employee[] e = {
            new Employee("Baylar", 20, 1000),
            new Employee("Asef", 35, 2000),
            new Employee("Cavid", 25, 3000)
        };

        Arrays.sort(e, Comparator.comparing(Employee:: getFirstName));
        System.out.println("Sort by firt name: ");
        for(Employee emp : e ){
            System.out.println(emp.getFirstName()+ " (age " + emp.getAge() + ", salary $" + emp.getSalary() + ")");
        }

        System.out.println("---------------------------------------------------------------");

        Arrays.sort(e, Comparator.comparingInt(Employee:: getAge));
        System.out.println("Sort by age: ");
        for(Employee emp : e ){
            System.out.println(emp.getFirstName()+ " (age " + emp.getAge() + ", salary $" + emp.getSalary() + ")");
        }

        System.out.println("---------------------------------------------------------------");

        Arrays.sort(e, Comparator.comparingDouble(Employee:: getSalary));
        System.out.println("Sort by salary");
        for(Employee emp : e ){
            System.out.println(emp.getFirstName()+ " (age " + emp.getAge() + ", salary $" + emp.getSalary() + ")");
        }
        
        
    }
}
