package PW5;

public class Employee {
    private String firstName;
    private int age;
    private double salary;
    public String getFirstName() {
        return firstName;
    }
    public Integer getAge() {
        return age;
    }
    public Double getSalary() {
        return salary;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee(String firstName, int age, double salary) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", age=" + age + ", salary=" + salary + "]";
    }
}
