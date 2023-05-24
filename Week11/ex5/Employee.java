package Week11.ex5;

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

    public Employee(Employee e) {
       this(e.getFirstName(), e.getAge(), e.getSalary());
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

    @Override
    public String toString() {
        return "Employee firstName "+firstName+ "age:"+age +", salary: " + salary;
    }
}
