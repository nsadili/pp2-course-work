package bonus;

public class Employee {
    private String name;
    private String department;
    private double salary;
    
    public Employee(String name, String dep, double salary) {
        this.name = name;
        this.department = dep;
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