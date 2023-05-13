public class Employee {
    private String firstname;
    private int age;
    private int salary;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String firstname, int age, int salary) {
        this.firstname = firstname;
        this.age = age;
        this.salary = salary;
    }
}
