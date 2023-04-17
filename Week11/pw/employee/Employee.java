package employee;

public class Employee {
    private String firstName;
    private int age;
    private double salary;
    private String department;

    public Employee(String firstName, int age, double salary) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String firstName, String department, double salary) {
        this.firstName = firstName;
        this.department = department;
        this.salary = salary;
    }

    public Employee(Employee e) {
       this(e.getFirstName(), e.getDepartment(), e.getSalary());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", age=" + age + ", salary=" + salary + ", department=" + department
                + "]";
    }

    
    // public int compareTo(Employee e) {
    // return firstName.length() - e.getFirstName().length();
    // }

    

   

}
