package Bonus;

public class Employee {
    private String name;
    private String department;
    private double salary;
    
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }
    

    
    
}