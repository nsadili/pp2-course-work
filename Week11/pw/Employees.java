public class Employees {
    private String firstname;
    private int age;
    private double salary;
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
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
    public Employees(String firstname, int age, double salary) {
        this.firstname = firstname;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employees [firstname=" + firstname + ", age=" + age + ", salary=" + salary + "]";
    }
}