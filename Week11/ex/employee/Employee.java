package employee;

public class Employee {
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

    // public int compareTo(Employee e) {
    //     return firstName.length() - e.getFirstName().length();
    // }

    @Override
    public String toString() {
        return "Employee [firstname = " + firstName + ", age = " + age + ", salary = " + salary + "]";
       
    }
    
}
